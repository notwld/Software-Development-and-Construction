import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {
    Gui(){
        setTitle("Gui Testing");
        setSize(700,700);
        setLayout(new BorderLayout(10,10));


        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));

        panel1.setBackground(Color.PINK);
        panel2.setBackground(Color.ORANGE);
        panel3.setBackground(Color.YELLOW);
        panel4.setBackground(Color.DARK_GRAY);
        panel5.setBackground(Color.BLACK);

        // ----------------------------------------------------
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        panel6.setPreferredSize(new Dimension(100,100));
        panel7.setPreferredSize(new Dimension(100,100));
        panel8.setPreferredSize(new Dimension(100,100));
        panel9.setPreferredSize(new Dimension(100,100));
        panel10.setPreferredSize(new Dimension(100,100));

        panel6.setBackground(Color.DARK_GRAY);
        panel7.setBackground(Color.YELLOW);
        panel8.setBackground(Color.ORANGE);
        panel9.setBackground(Color.PINK);
        panel10.setBackground(Color.BLACK);

        JLabel label = new JLabel(new ImageIcon("assets/o.jpg"));
        panel10.add(label);

        panel5.setLayout(new BorderLayout(10,10));

        panel5.add(panel6,BorderLayout.SOUTH);
        panel5.add(panel7,BorderLayout.WEST);
        panel5.add(panel8,BorderLayout.EAST);
        panel5.add(panel9,BorderLayout.NORTH);
        panel5.add(panel10,BorderLayout.CENTER);

        add(panel1,BorderLayout.SOUTH);
        add(panel2,BorderLayout.WEST);
        add(panel3,BorderLayout.EAST);
        add(panel4,BorderLayout.NORTH);
        add(panel5,BorderLayout.CENTER);
//        setResizable(false);
        setVisible(true);
    }
}
