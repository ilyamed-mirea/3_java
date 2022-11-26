package n16.n2;

import javax.swing.*;
import java.awt.*;

public class Fonter extends JFrame {
    // write a program that renders a window with a JTextArea and a JComboBox with a selection of fonts and colors
    // and a button that changes the font and color of the text in the JTextArea

    Fonter() {
        super("Fonter");
        setSize(250, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        JTextArea textArea = new JTextArea(5, 10);
        add(textArea);
        String[] fonts = {"Times New Roman", "Courier New", "MS Sans Serif"};
        JComboBox<String> fontComboBox = new JComboBox<>(fonts);
        add(fontComboBox);
        String[] colors = {"Blue", "Red", "Black"};
        JComboBox<String> colorComboBox = new JComboBox<>(colors);
        add(colorComboBox);
        JButton button = new JButton("Change");
        add(button);
        button.addActionListener(e -> {
            String font = (String) fontComboBox.getSelectedItem();
            String color = (String) colorComboBox.getSelectedItem();
            textArea.setFont(new Font(font, Font.PLAIN, 12));
            switch (color) {
                case "Black":
                    textArea.setForeground(Color.BLACK);
                    break;
                case "Red":
                    textArea.setForeground(Color.RED);
                    break;
                case "Blue":
                    textArea.setForeground(Color.BLUE);
                    break;
            }
        });
    }

    public static void main(String[] args) {
        new Fonter().setVisible(true);
    }

}
