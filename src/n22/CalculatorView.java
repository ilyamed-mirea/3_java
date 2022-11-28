package n22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.concurrent.Callable;

public class CalculatorView extends JFrame {
    private ButtonTypes button;
    JTextField textField = new JTextField(2);

    JButton[] operations = {new JButton(String.valueOf(ButtonTypes.SUM)), new JButton(String.valueOf(ButtonTypes.SUB)), new JButton(String.valueOf(ButtonTypes.MUL)), new JButton(String.valueOf(ButtonTypes.DEL)), new JButton(String.valueOf(ButtonTypes.RESULT)), new JButton(String.valueOf(ButtonTypes.DOT))};
    JButton[] numbers = new JButton[]{new JButton("0"), new JButton("1"), new JButton("2"), new JButton("3"), new JButton("4"), new JButton("5"), new JButton("6"), new JButton("7"), new JButton("8"), new JButton("9")};

    public void setText(String result) {
        textField.setText(result);
    }
    public String getText() {
        return textField.getText();
    }

    public CalculatorView(ActionListener onClick) {
        super("PolishCalc");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));
        add(textField);

        JPanel numbersPanel = new JPanel();
        numbersPanel.setLayout(new GridLayout(4, 3));
        for (JButton number : numbers) {
            number.addActionListener(onClick);
            numbersPanel.add(number);
        }

        JPanel operationsPanel = new JPanel();
        operationsPanel.setLayout(new GridLayout(2, 3));
        for (JButton operation : operations) {
            operation.addActionListener(onClick);
            operationsPanel.add(operation);
        }

        add(numbersPanel);
        add(operationsPanel);
    }
}
