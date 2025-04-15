import javax.swing.*;
import java.awt.*;

class Afirst{
  public static void main(String [] args){
    String s = "BISMILLAH-IR-RAHMAAN-IR-RAHEEM";
    System.out.println(s);
    JFrame frame = new JFrame();

    frame.setVisible(true);
    frame.setSize(500, 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new FlowLayout());

    JLabel label = new JLabel(s);
    frame.add(label);
  }
}
