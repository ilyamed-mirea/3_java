package n22;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private static CalculatorView view;
    private static CalculatorModel model;

    public CalculatorController(CalculatorView view, CalculatorModel model) {
        this.view = view;
        this.model = model;
    }

    public static void handleClick(ActionEvent e) {
        String textField = view.getText();
        try {
            System.out.println(e.getActionCommand());
            ButtonTypes button = ButtonTypes.valueOf(e.getActionCommand());
            switch (button) {
                case SUM -> textField += "+ ";
                case SUB -> textField += "- ";
                case MUL -> textField += "* ";
                case DEL -> textField += "/ ";
                case DOT -> textField += ".";
                case RESULT -> {
                    try {
                        System.out.println(textField);
                        System.out.println(model.calc(textField));
                        textField = Double.toString(model.calc(textField));
                    } catch (Exception exception) {
                        textField = exception.getMessage();
                    }
                }
                default -> {
                }
            }
        } catch (IllegalArgumentException ex) {
            System.out.println("Not a operation");
            textField += e.getActionCommand() + " ";
        }
        view.setText(textField);
    }

    public static void main(String[] args) {
        CalculatorView view = new CalculatorView(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleClick(e);
            }
        });
        CalculatorModel model = new CalculatorModel();
        CalculatorController controller = new CalculatorController(view, model);
        view.setVisible(true);

    }
}
