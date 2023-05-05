import javax.swing.*;
import java.awt.*;

public class Task extends JFrame {
    public Task() {
        setTitle("My Application");
        setSize(400, 300);

        JButton button = new JButton("Open Window");
        button.setBounds(50, 50, 100, 30);
        button.addActionListener(e -> {
            JDialog dialog = new JDialog(this, "New Window", true);
            dialog.setSize(300, 200);
            dialog.setLocationRelativeTo(this);

            JPanel panel = new JPanel();
            panel.setLayout(null);

            JLabel label1 = new JLabel("Name:");
            label1.setBounds(10, 10, 80, 25);
            panel.add(label1);

            JTextField textField1 = new JTextField(20);
            textField1.setBounds(100, 10, 160, 25);
            panel.add(textField1);

            JLabel label2 = new JLabel("Email:");
            label2.setBounds(10, 40, 80, 25);
            panel.add(label2);

            JTextField textField2 = new JTextField(20);
            textField2.setBounds(100, 40, 160, 25);
            panel.add(textField2);

            JLabel label3 = new JLabel("Options:");
            label3.setBounds(10, 70, 80, 25);
            panel.add(label3);

            JCheckBox checkBox1 = new JCheckBox("Option 1");
            checkBox1.setBounds(100, 70, 100, 25);
            panel.add(checkBox1);

            JCheckBox checkBox2 = new JCheckBox("Option 2");
            checkBox2.setBounds(100, 100, 100, 25);
            panel.add(checkBox2);

            JButton okButton = new JButton("OK");
            okButton.setBounds(100, 130, 80, 25);
            okButton.addActionListener(event -> {
                String name = textField1.getText();
                String email = textField2.getText();
                String options = (checkBox1.isSelected() ? "Option 1 " : "") + (checkBox2.isSelected() ? "Option 2" : "");
                JOptionPane.showMessageDialog(dialog, "Name: " + name + "\nEmail: " + email + "\nOptions: " + options);
                dialog.dispose();
            });
            panel.add(okButton);

            dialog.setContentPane(panel);
            dialog.setVisible(true);
        });

        JLayeredPane layeredPane = getLayeredPane();
        layeredPane.add(button, new Integer(1));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Task();
    }

}