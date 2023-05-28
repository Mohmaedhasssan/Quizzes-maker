import javax.swing.*;
import java.awt.*;

public class project extends JFrame{
     private JLabel titlelabel , q1 , q2 , q3,q4 ,q5 ,q6 ,q7 ;
     private JPanel title , questions ,button ;
     private JButton add , delete , modifiy;
     public project() {
          super("Quiz");
          setLayout(new BorderLayout(10,10));
          //title
          title = new JPanel();
          title.setLayout( new FlowLayout());
          titlelabel = new JLabel("QUIZ 1");
          titlelabel.setFont(new Font("null", Font.PLAIN, 23));
          titlelabel.setFont(titlelabel.getFont().deriveFont(Font.BOLD));
          title.add(titlelabel);
          add(title,BorderLayout.NORTH);

          //questions
          questions = new JPanel();
          questions.setLayout(new GridLayout(4,1));

          q1 = new JLabel("Question 1 :");
          q1.setFont(new Font("", Font.PLAIN, 15));
          questions.add(q1);

          q2 = new JLabel("Question 2 :")    ;
          q2.setFont(new Font("", Font.PLAIN, 15));
          questions.add(q2);

          q3 = new JLabel("Question 3 :");
          q3.setFont(new Font("", Font.PLAIN, 15));
          questions.add(q3);

          q4 = new JLabel("Question 4 :");
          q4.setFont(new Font("", Font.PLAIN, 15));
          questions.add(q4);

          add(questions,BorderLayout.CENTER);


          //button

          button = new JPanel();
          button.setLayout( new FlowLayout());

          add=new JButton("Add Question");
          add.setFont(new Font("", Font.PLAIN, 15));
          button.add(add);

          delete=new JButton("Delete Question");
          delete.setFont(new Font("", Font.PLAIN, 15));
          button.add(delete);

          modifiy=new JButton("Modifiy Question");
          modifiy.setFont(new Font("", Font.PLAIN, 15));
          button.add(modifiy);

          add(button,BorderLayout.SOUTH);


     }
}

