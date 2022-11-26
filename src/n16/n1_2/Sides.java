package n16.n1_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Sides extends JFrame {
    Sides() {
        super("Sides");
        setSize(250, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JPanel top = new JPanel();
        top.setBackground(Color.RED);
        add(top, BorderLayout.NORTH);
        JPanel bottom = new JPanel();
        bottom.setBackground(Color.BLUE);
        add(bottom, BorderLayout.SOUTH);
        JPanel left = new JPanel();
        left.setBackground(Color.GREEN);
        add(left, BorderLayout.WEST);
        JPanel right = new JPanel();
        right.setBackground(Color.YELLOW);
        add(right, BorderLayout.EAST);
        top.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в САО", "САО", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        bottom.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в ЮАО", "ЮАО", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        left.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в ЗАО", "ЗАО", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        right.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в ВАО", "ВАО", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
        new Sides().setVisible(true);
    }

}
