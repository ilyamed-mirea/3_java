package n14.n8;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Filtrator implements Filter{
    StringBuilder[] testStr = new StringBuilder[]{new StringBuilder("a2bc"), new StringBuilder("def"), new StringBuilder("gh3i"), new StringBuilder("jkl"), new StringBuilder("mno"), new StringBuilder("pqr"), new StringBuilder("stu"), new StringBuilder("vwx"), new StringBuilder("yz"), new StringBuilder("18340")};
    @Override
    public void apply(StringBuilder[] strings) {
        //regex filter no numbers in string
        String regex = "[^0-9]+";
        //filter strings by regex
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        for (int i = 0; i < strings.length; i++) {
            matcher = pattern.matcher(strings[i]);
            if (!matcher.matches()) {
                //remove from array
                strings[i] = null;
            }
            //strings[i];
        }
    }


    @Override
    public String toString() {
        return "Filtrator{" +
                "testStr=" + Arrays.toString(testStr) +
                '}';
    }
}
