import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class buttonTesting extends JFrame implements ActionListener {
    JButton btn = new JButton();
    JLabel label;
    int counter = 1;
    buttonTesting(){
        this.setSize(500,500);

        btn.setText("Counter++");
        btn.setBounds(this.getWidth()/4,this.getHeight()/3,250,100);
        btn.addActionListener(this);
        btn.setBackground(Color.DARK_GRAY);
        btn.setForeground(Color.green);
        btn.setFocusable(false);
        btn.setVerticalTextPosition(JLabel.CENTER);
        btn.setHorizontalTextPosition(JLabel.CENTER);
        this.add(btn);

        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);

        label = new JLabel();
        label.setText("0");
        label.setBounds(this.getWidth()/2,this.getHeight()/5,250,100);
        label.setVerticalTextPosition(JLabel.CENTER);
        label.setHorizontalTextPosition(JLabel.CENTER);
        this.add(label);
        this.setLayout(null);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==btn){
            label.setText(String.valueOf(counter++));
        }

    }
}
