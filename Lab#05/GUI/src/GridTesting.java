import javax.swing.*;
import java.awt.*;

public class GridTesting {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3,3));
        frame.setSize(500,500);



        JButton btn1 = new JButton("1");
        frame.add(btn1);
        JButton btn2 = new JButton("2");
        frame.add(btn2);
        JButton btn3 = new JButton("3");
        frame.add(btn3);
        JButton btn4 = new JButton("4");
        frame.add(btn4);
        JButton btn5 = new JButton("5");
        frame.add(btn5);
        JButton btn6 = new JButton("6");
        frame.add(btn6);
        JButton btn7 = new JButton("7");
        frame.add(btn7);
        JButton btn8 = new JButton("8");
        frame.add(btn8);
        JButton btn9 = new JButton("9");
        frame.add(btn9);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setSize(50,50);
        JButton btn = new JButton("+");
        btn.setSize(50,50);
        panel.add(btn);
        frame.add(panel);

        frame.setVisible(true);

    }
}
