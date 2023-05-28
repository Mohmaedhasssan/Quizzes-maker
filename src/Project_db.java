/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_db;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author dell
 */
public class Project_db extends JFrame {

    JTextField student_name, first_subject, second_subject;
    JButton add, delete, update;
    JTable table;
    Connection connection;
    Statement statement;

    public Project_db() {
        db_connection();
        fill_table();
        create_gui();
    }

    public void create_gui() {
        student_name = new JTextField();
        first_subject = new JTextField();
        second_subject = new JTextField();
        add = new JButton("add");
        delete = new JButton("delete");
        update = new JButton("update");

        add.addActionListener((e) -> {
            insert();
            dispose();
            new Project_db();
        });
        
        delete.addActionListener((e) -> {
            delete();
            dispose();
            new Project_db();
        });
        update.addActionListener((e) -> {
            update();
            dispose();
            new Project_db();
        });
        
        
        fill_table();

        student_name.setBounds(90, 10, 200, 30);
        first_subject.setBounds(90, 50, 200, 30);
        second_subject.setBounds(90, 90, 200, 30);

        add.setBounds(30, 130, 100, 40);
        delete.setBounds(140, 130, 100, 40);
        update.setBounds(250, 130, 100, 40);
        table.setBounds(30, 180, 320, 150);
        student_name.setFont(new Font(null, Font.LAYOUT_NO_LIMIT_CONTEXT, 20));
        first_subject.setFont(new Font(null, Font.LAYOUT_NO_LIMIT_CONTEXT, 20));
        second_subject.setFont(new Font(null, Font.LAYOUT_NO_LIMIT_CONTEXT, 20));

        add.setFont(new Font(null, Font.LAYOUT_NO_LIMIT_CONTEXT, 15));
        delete.setFont(new Font(null, Font.LAYOUT_NO_LIMIT_CONTEXT, 15));
        update.setFont(new Font(null, Font.LAYOUT_NO_LIMIT_CONTEXT, 15));

        table.setFont(new Font(null, Font.ROMAN_BASELINE, 15));
        add(student_name);
        add(first_subject);
        add(second_subject);
        add(add);
        add(delete);
        add(update);
        add(table);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void fill_table() {
        ArrayList<String> names_list = new ArrayList<>();
        ArrayList<String> s1_list = new ArrayList<>();
        ArrayList<String> s2_list = new ArrayList<>();

        try {
            /*
            String[][] data = {
            {"ali", "math", "os"},
            {"mohamed", "java", "co"},
            {"Ibrahim", "multi media", "os"},};
            table = new JTable(data, columns);
             */
            statement = connection.createStatement();
            // select data 
            ResultSet result = statement.executeQuery("SELECT * FROM my_db.student_data;");
            while (result.next()) {
                names_list.add(result.getString(2));
                s1_list.add(result.getString(3));
                s2_list.add(result.getString(4));
            }
            String data[][] = new String[names_list.size()][3];
            for (int i = 0; i < names_list.size(); i++) {
                data[i][0] = names_list.get(i);
                data[i][1] = s1_list.get(i);
                data[i][2] = s2_list.get(i);
            }
            String columns[] = {"student name", "subject 1", "subject 2"};

            table = new JTable(data, columns);

        } catch (SQLException ex) {
            System.out.println("error in table data");
        }

    }

    public static void main(String[] args) {
        new Project_db();
    }

    private void db_connection() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "root");
        } catch (SQLException ex) {
            System.out.println("db connection error");
        }
    }

    private void insert(){
        try {
            statement.executeUpdate("INSERT INTO `my_db`.`student_data` (`name`, `s1`, `s2`) VALUES ( '"+student_name.getText()+"', '"+first_subject.getText()+"', '"+second_subject.getText()+"');");
        } catch (SQLException ex) {
            System.out.println("error in insert statement");
        }
    }
    
    private void delete (){
        try {
            statement.executeUpdate("DELETE FROM `my_db`.`student_data` WHERE `name`='"+student_name.getText()+"';");
        } catch (SQLException ex) {
            System.out.println("error in delete");
        }
    }
     private void update (){
        try {
            statement.executeUpdate("UPDATE `my_db`.`student_data` SET `s1`='"+first_subject.getText()+"', `s2`='"+second_subject.getText()+"' WHERE `name`='"+student_name.getText()+"';");
        } catch (SQLException ex) {
            System.out.println("error in update");
        }
    }
    
}
