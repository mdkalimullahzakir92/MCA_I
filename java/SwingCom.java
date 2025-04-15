import javax.swing.*;
import java.awt.*;

public class SwingCom {
    public static void main(String[] args) {
        JFrame jfrm = new JFrame();
        jfrm.setVisible(true);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(300, 475);
        jfrm.setLayout(new BorderLayout());

        JLabel lab = new JLabel("Text");
        jfrm.add(lab, BorderLayout.NORTH);


//        JButton btn = new JButton("test");
//        jfrm.add(btn, BorderLayout.CENTER);

        JPanel frame = new JPanel();

        frame.setLayout(new GridLayout(3, 3));
        for (int i = 1; i <= 9; i++) {
            frame.add(new JButton("Button " + i));
        }


        jfrm.add(frame);
//        frame.add(new JButton("Button 1"));
//        frame.add(new JButton("Button 2"));
//        frame.add(new JButton("Button 3"));

    }
}
