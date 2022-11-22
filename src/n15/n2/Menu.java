package n15.n2;

import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame {
    //write a method that renders a window with a menu with a selection of countries using JComboBox
    //and a button that displays the selected country in a JOptionPane

    Menu() {
        super("Menu");
        setLayout(new FlowLayout());
        setSize(250, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        String[] countries = {"Russia", "USA", "Germany", "France", "Italy", "Spain", "China", "Japan", "South Korea", "India"};
        JComboBox<String> comboBox = new JComboBox<>(countries);
        add(comboBox);

        JButton button = new JButton("Show");
        add(button);
        button.addActionListener(e -> {
            String country = (String) comboBox.getSelectedItem();
            JOptionPane.showMessageDialog(null, country, "Country", JOptionPane.INFORMATION_MESSAGE);
        });


    }
    public static void main(String[] args) {
        new Menu().setVisible(true);
    }


}
