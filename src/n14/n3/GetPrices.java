package n14.n3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetPrices {
    public static void main(String[] args) {
        String prices = "25.98 USD 25.98 EU 25.98 RUB 25.98 EU";
        String regex = "\\d+\\.\\d+\\s[USD|EU|RUB]+";
        //get prices like "25.98 USD" from string prices using regex and Matcher
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(prices);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
