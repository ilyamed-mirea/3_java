package n16.n1;

import javax.swing.*;
import java.awt.*;

public class Guesser extends JFrame {

    static int randomNumber;
    static int attempts = 0;
    static int maxAttempts = 3;

    Guesser() {
        super("Guesser");
        setSize(250, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        JTextField textField = new JTextField(10);
        add(textField);
        JButton button = new JButton("Guess");
        add(button);
        int randomNumber = (int) (Math.random() * 20);
        //show value for debug: add(new JLabel(String.valueOf(randomNumber)));
        attempts = 0;
        button.addActionListener(e -> {
            String text = textField.getText();
            int number = Integer.parseInt(text);
            if (number == randomNumber) {
                JOptionPane.showMessageDialog(null, "You win!", "Win", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            } else {
                attempts++;
                if (attempts >= maxAttempts) {
                    JOptionPane.showMessageDialog(null, "You lose!", "Lose", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                } else {
                    JOptionPane.showMessageDialog(null, "No, the number is " + (number > randomNumber ? "smaller" : "bigger") + "!", "Try again", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        new Guesser().setVisible(true);
    }


}
