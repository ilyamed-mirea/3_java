package n15.n3;

import javax.swing.*;
import java.awt.*;

public class Third extends JFrame {
    //write a menu, two buttons and a text input field. In this program, you should have different settings in the menu. There should be a "File" menu that includes the "Save", "Exit" and "Edit" submenus, including the "Copy, Cut, Paste" submenu and the "Help" menu.

    Third() {
        super("Third");
        setLayout(new FlowLayout());
        setSize(250, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem pasteItem = new JMenuItem("Paste");
        JMenuItem helpItem = new JMenuItem("Help");
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        editMenu.add(copyItem);
        editMenu.add(cutItem);
        editMenu.add(pasteItem);
        helpMenu.add(helpItem);
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        setJMenuBar(menuBar);
        //write 2 buttons and a text input field on a next line
        JButton button1 = new JButton("Button1");
        JButton button2 = new JButton("Button2");
        JTextField textField = new JTextField(10);
        add(button1);
        add(button2);
        add(textField);

        /*
        JTextField textField = new JTextField(10);
        add(textField);
        JButton button = new JButton("Show");
        add(button);
        button.addActionListener(e -> {
            String text = textField.getText();
            JOptionPane.showMessageDialog(null, text, "Text", JOptionPane.INFORMATION_MESSAGE);
        });*/
    }

    public static void main(String[] args) {
        new Third().setVisible(true);
    }

}
