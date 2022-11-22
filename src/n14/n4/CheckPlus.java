package n14.n4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPlus {
    public static void main(String[] args) {
        String regex = "\\d+\s\\+";

        String input = "(1 + 8) – 9 / 4";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        System.out.println( matcher.results().count()>0 );

        input = "6 / 5 – 2 * 9";
        matcher = pattern.matcher(input);
        System.out.println( matcher.results().count()>0 );
    }
}
