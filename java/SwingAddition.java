import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class SwingAddition {
    public static void main(String[] args) {
        System.out.println("Abdullah");
        Addition obj = new Addition();
    }
}
class Addition extends JFrame implements ActionListener {
    JTextField t1,t2, t3;
    JButton b;
    JLabel l;
    public Addition(){
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(20);
        b = new JButton("Ok");
        l = new JLabel("Result");

        b.addActionListener(this);// action listener is interface

        /*

         b.addActionListener(ae ->
        {
                int num1= Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int value = num1+ num2;
                l.setText(value +"");


        }
        );// action listener is interface

        */

        add(t1);
        add(t2);
        add(t3);
        add(b);
        add(l);


        setLayout(new FlowLayout());
        setVisible(true);
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed( ActionEvent ae){
        int num1= Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());
         int value = num1+ num2;
         l.setText(value +"");
         t3.setText(value+ "  text ");

    }

}