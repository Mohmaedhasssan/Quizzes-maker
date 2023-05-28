
package gui1;
import sun.font.TrueTypeFont;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.security.KeyStore;
import javax.swing.plaf.basic.BasicSliderUI;

public class GUI1 {
 static public class BarmejFrame extends JFrame {
   private JLabel titleLabel;
   private JButton b1 ;
   private JButton b2 ;
   private JButton b3 ;
   private JButton b4 ;
   private JButton b5 ;
   
     /*JButton b1=new JButton("quiz 1");
        JButton b2=new JButton("quiz 2");
        JButton b3=new JButton("quiz 3");
        JButton b4=new JButton("Rename quiz");
        JButton b5=new JButton("Delete quiz ");
   
   */
     public BarmejFrame() {
       super("Frame 4");
       setLayout(new FlowLayout());
       titleLabel=new JLabel("List of quizes");
       add(titleLabel);
       
       b1=new JButton("quiz 1");
       add(b1);
        b1.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }
       });
        
           b2=new JButton("quiz 2");
       add(b2);
        b2.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }
       });
        
           b3=new JButton("quiz 3");
       add(b3);
        b3.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }
       });
        
               b4=new JButton("Rename quiz");
       add(b4);
        b4.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }
       });
        
               b5=new JButton("delete quiz");
       add(b5);
        b5.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }
       });
        
                
         titleLabel.setBounds(50, 10, 100, 30);
        b1.setBounds(50, 50, 70, 30);
        b2.setBounds(50, 110, 70, 30);
        b3.setBounds(50, 170, 70, 30);
        b4.setBounds(50, 220, 110, 30);
        b5.setBounds(170, 220, 100, 30);

    }
 }
 
   
 
    public static void main(String[] args) {
        BarmejFrame barmejFrame;
     barmejFrame = new BarmejFrame();
     barmejFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     barmejFrame.setSize(250,250);
     barmejFrame.setVisible(true);
     barmejFrame.setLocationRelativeTo(null);
    
        
    }
    
}
