package n2;

import java.util.Arrays;
import java.util.GregorianCalendar;

public class StringSwap {
    static int length = 4;
    static String[] stringsArray = new String[]{"test1","test2","test3","test4"};
    public static void main(String[] args) {
        Arrays.stream(stringsArray).reduce("", (a,b)->{return b+a;});
        for (int i=0;i<length;i++)
            System.out.println(stringsArray[i]);
    }
}

