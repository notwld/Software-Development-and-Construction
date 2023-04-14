import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task implements ActionListener {
    JButton btn;
    JFrame frame;
    Task() {
        ImageIcon img = new ImageIcon("assets/pleading.png");
        frame = new JFrame("Task");
        frame.setSize(200,300);
        frame.setIconImage(img.getImage());
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));


        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(200,150));
        panel.setBackground(Color.gray);


        btn = new JButton("Open Frame");
        btn.addActionListener(this);
        panel.add(btn);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn){
            JFrame newFrame = new JFrame();
            newFrame.setSize(700,700);
            newFrame.add(new JLabel(new ImageIcon("assets/pleading.png")));
            newFrame.setVisible(true);
        }
    }
}
