package n2;

import java.util.Objects;
import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        System.out.println("write words. to end print 'end'\n");
        Scanner sc = new Scanner(System.in);
        String word = "";
        int counter = 0;
        while (!Objects.equals(word, "end")) {
           word = sc.nextLine();
           counter++;
        }
        counter--; //'end'
        System.out.printf("\nyou write %d words. congrats",counter);
    }
}
