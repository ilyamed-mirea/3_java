package n14.n5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckDate {
    public static void main(String[] args) {
        //write regex that test date in format dd/mm/yyyy when year is more than 1900 and less 1999
        String regex = "\\d{2}/\\d{2}/(19)\\d{2}";
        //String regex = "\\d{2}/\\d{2}/\\d{4}";
        //true
        String date1 = "29/02/1923";
        String date2 = "30/04/1956";
        String date3 = "01/01/1900";
        //false
        String date4 = "29/02/2001";
        String date5 = "30-04-2003";
        String date6 = "1/1/1899";
        Pattern pattern = Pattern.compile(regex);
        System.out.println(pattern.matcher(date1).results().count() > 0);
        System.out.println(pattern.matcher(date2).results().count() > 0);
        System.out.println(pattern.matcher(date3).results().count() > 0);
        System.out.println(pattern.matcher(date4).results().count() > 0);
        System.out.println(pattern.matcher(date5).results().count() > 0);
        System.out.println(pattern.matcher(date6).results().count() > 0);

    }
}
