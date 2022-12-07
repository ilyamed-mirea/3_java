package n25.n4;

public class Skobki {
    public static void main(String[] args) {
        //Create a regex to check correctly written expressions with brackets (the number of open and closed brackets should be the same).
        String regex = "(?=\\()(?:(?=.*?\\((?!.*?\\1)(.*\\)(?!.*\\2).*))(?=.*?\\)(?!.*?\\2)(.*)).)+?.*?(?=\\1)[^(]*"; //end: (?=\2$)
        String expression = "((2+2)*2)"; //true
        String expression2 = "(3*+*5)*+2"; //true
        String expression3 = "((3*+*5)*–*9*×*4"; //false
        String expression4 = "((2+2)*2"; //false

        System.out.println(expression.matches(regex));
        System.out.println(expression2.matches(regex));
        System.out.println(expression3.matches(regex));
        System.out.println(expression4.matches(regex));
    }
}
