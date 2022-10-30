package n2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringSwap {
    static int length = 4;
    //static String[] stringsArray = new String[]{"test1","test2","test3","test4"};
    static List<String> stringsArray = Arrays.asList("test1","test2","test3","test4");
    public static void main(String[] args) {
        Collections.reverse(stringsArray);

        for (int i=0;i<length;i++)
            System.out.println(stringsArray.get(i));
    }
}

