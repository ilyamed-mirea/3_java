package n16.n3;

import javax.swing.*;
import java.awt.*;

public class checkPass extends JFrame {
    checkPass() {
        super("checkPass");
        setSize(250, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        JPanel panel = new JPanel();
        //GridBagLayout just for fun
        panel.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(new JLabel("Service"), constraints);
        constraints.gridx = 1;
        panel.add(new JTextField(10), constraints);
        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(new JLabel("Username"), constraints);
        constraints.gridx = 1;
        panel.add(new JTextField(10), constraints);
        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(new JLabel("Password"), constraints);
        constraints.gridx = 1;
        panel.add(new JTextField(10), constraints);
        add(panel);
    }

    public static void main(String[] args) {
        new checkPass().setVisible(true);
    }

}
