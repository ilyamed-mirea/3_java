package n22;

import java.util.Stack;

public class CalculatorModel {
    //calculate result of expression in polish notation (reverse polish notation)
    public static double calc(String expression) {
        Stack<Double> stack = new Stack<>();
        String[] tokens = expression.split(" ");
        for (String token : tokens) {
            if (token.equals(" ")) {
                continue;
            }
            if (isOperator(token)) {
                double a = stack.pop();
                double b = stack.pop();
                double result = 0;
                switch (token) {
                    case "+":
                        result = b + a;
                        break;
                    case "-":
                        result = b - a;
                        break;
                    case "*":
                        result = b * a;
                        break;
                    case "/":
                        result = b / a;
                        break;
                }
                stack.push(result);
            } else {
                stack.push(Double.parseDouble(token));
            }
        }
        return stack.pop();
    }

    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }
}
