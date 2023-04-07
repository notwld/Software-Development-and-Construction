import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class gui extends JFrame{
    gui(){
        this.setTitle("GUI Testing");

        this.setResizable(false);
        this.setSize(520,520);

        JPanel DpurplePanel = new JPanel();
        JLabel thorfinn = new JLabel(new ImageIcon("assets/thorfinn.jpg"));
        DpurplePanel.add(thorfinn);
        DpurplePanel.setBackground(new Color(31,19,70));
        DpurplePanel.setBounds(0,0,250,250);
        this.add(DpurplePanel);

        JPanel purplePanel = new JPanel();
        JLabel guts = new JLabel(new ImageIcon("assets/guts.jpg"));
        purplePanel.add(guts);
        purplePanel.setBackground(new Color(92,74,149));
        purplePanel.setBounds(DpurplePanel.getWidth(),0,250,250);
        this.add(purplePanel);

        JPanel yPanel = new JPanel();
        yPanel.setBackground(new Color(255,189,89));
        yPanel.setBounds(0,DpurplePanel.getHeight(),250,250);
        this.add(yPanel);

        JPanel wPanel = new JPanel();
        wPanel.setBackground(new Color(243,233,210));
        wPanel.setBounds(yPanel.getWidth(),DpurplePanel.getHeight(),250,250);
        this.add(wPanel);

        this.getContentPane().setBackground(Color.darkGray);


        this.setLayout(null);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
