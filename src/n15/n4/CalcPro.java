package n15.n4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CalcPro extends JFrame {
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton buttonSum = new JButton(String.valueOf(ButtonTypes.SUM));
    JButton buttonSub = new JButton(String.valueOf(ButtonTypes.SUB));
    JButton buttonMul = new JButton(String.valueOf(ButtonTypes.MUL));
    JButton buttonDel = new JButton(String.valueOf(ButtonTypes.DEL));
    Font fnt = new Font("Times new roman", Font.BOLD, 20);

    ActionListener buttonClicked() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Object source = e.getSource();
                System.out.println(source);
                try {
//переменная для хранения ввода в текстовое поле 1
                    double x1 = Double.parseDouble(jta1.getText().trim());
//переменная для хранения ввода в текстовое поле 2
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    double result;
                    if (buttonSum.equals(source)) {
                        result = x1 + x2;
                    } else if (buttonSub.equals(source)) {
                        result = x1 - x2;
                    } else if (buttonMul.equals(source)) {
                        result = x1 * x2;
                    } else if (buttonDel.equals(source)) {
                        result = x1 / x2;
                    } else {
                        result = 0;
                    }
//создаем всплывающее окно INFORMATION_MESSAGE
                    JOptionPane.showMessageDialog(null, "Result = " + result, "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception err) {
//создаем всплывающее окно ERROR_MESSAGE
                    JOptionPane.showMessageDialog(null, "Error in Numbers !", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        };
    }

    ActionListener buttonWithNumClicked() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int number = Integer.parseInt(((JButton) e.getSource()).getText());
                try {
                    if (jta1.getText().trim().equals("")) {
                        jta1.setText(String.valueOf(number));
                    }
                    else if (jta2.getText().trim().equals("")) {
                        jta2.setText(String.valueOf(number));
                    }
                } catch (Exception err) {
                    JOptionPane.showMessageDialog(null, "Error in Numbers !", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        };
    }

    //начало конструктора класса LabExample
    CalcPro() {
        super("Example");
        setLayout(new FlowLayout());
        setSize(250, 150);
// создаем надпись 1
        add(new JLabel("1st Number"));
// добавляем текстовое поле jta1
        add(jta1);
// создаем надпись 2
        add(new JLabel("2nd Number"));
// добавляем текстовое поле jta2
        add(jta2);
        // добавляем кнопки

        add(buttonSum);
        add(buttonSub);
        add(buttonMul);
        add(buttonDel);

//добавляем слушатели к кнопкам

        buttonSum.addActionListener(buttonClicked());
        buttonSub.addActionListener(buttonClicked());
        buttonMul.addActionListener(buttonClicked());
        buttonDel.addActionListener(buttonClicked());

        //add buttons with numbers 0-9
        for (int i = 0; i < 10; i++) {
            JButton button = new JButton(String.valueOf(i));
            add(button);
            button.addActionListener(buttonWithNumClicked());
        }

    } // конец конструктора

    public static void main(String[] args) {
        new CalcPro().setVisible(true);
    } // конец main()
} // конец класса LabExample