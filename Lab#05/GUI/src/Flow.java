import javax.swing.*;
import java.awt.*;

public class Flow {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new FlowLayout(FlowLayout.CENTER));

        JPanel panel = new JPanel();
        panel.setBackground(Color.gray);
        panel.setPreferredSize(new Dimension(250,250));
        panel.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));

        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");

        panel.add((btn1));
        panel.add((btn2));
        panel.add((btn3));
        panel.add((btn4));
        panel.add((btn5));

        frame.add(panel);
        frame.setVisible(true);
    }
}