package Assignments;

import org.w3c.dom.Text;

import  javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Circle implements ActionListener{
    public final double PI = 3.14159;
    double radius;
    public Circle() {
        radius= 0.0;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public double findArea(){
        return PI * radius * radius;
    }
    public void actionPerformed(ActionEvent e, TextArea t1, TextArea t2, JLabel l){
        int a,b;
        a = Integer.parseInt(t1.getText());
        b = Integer.parseInt(t1.getText());
        int sum = a+b;
        l.setText(sum+"");

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
public class SwingTest {
    public static void main(String[] args) {
        System.out.println("Abdullah");
        JFrame f =new JFrame("Welcome");    // show title of frame
        f.setSize(400,400);         // set size of frame
        f.setVisible(true);                     // make frame visible
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());          // components occupy centre of frame

        JLabel label2 = new JLabel("Text");
        JTextField t1 = new JTextField(20);
        JTextField t2 = new JTextField(20);
        JButton b = new JButton("OK");// caption is ok, by default button is dumb
        JLabel label1 = new JLabel("Area Calculator");

        f.add(label1);
        f.add(label2);

        Circle c = new Circle();

//        b.addActionListener(c, t1, t2, label1); // listen to event
//        f.add(b);
//        f.add(t1);
//        f.add(t2);

        /*
        import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Listener Example");
        JButton button = new JButton("Click Me");

        // Adding an ActionListener using an anonymous inner class
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked!");
            }
        });

        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
        */





    }
}
