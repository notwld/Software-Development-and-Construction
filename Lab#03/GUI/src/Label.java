import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Label extends JFrame{
        Label(){
            Border border = BorderFactory.createLineBorder(Color.MAGENTA,5);

            JLabel label = new JLabel();
            label.setText("Farq nahi parta");

            label.setHorizontalAlignment(JLabel.CENTER);
            label.setVerticalAlignment(JLabel.CENTER);

            label.setHorizontalTextPosition(JLabel.CENTER);
            label.setVerticalTextPosition(JLabel.CENTER);

            ImageIcon imageIcon = new ImageIcon("pepe.png");
            label.setIcon(imageIcon);
            label.setForeground(Color.WHITE);
            label.setFont(new Font("Ariel",Font.BOLD,31));
            label.setBackground(Color.black);
            label.setOpaque(true);
//            label.setOpaque(true);
            label.setBorder(border);

           this.getContentPane().setBackground(new Color(68, 68, 68));
           this.add(label);
           this.setSize(500,500);
           this.pack();
           this.setVisible(true);
        }
    }
