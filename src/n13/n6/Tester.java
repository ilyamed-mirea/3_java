package n13.n6;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        getLine(input);
    }


    // sort input string: last char in first string is the first char in the second string

    static void getLine(String input) {
        String[] splitted = input.split(" ");
        String[] result = new String[splitted.length];
        result[0] = splitted[0];
        for (int i = 1; i < splitted.length; i++) {
            for (int j = 0; j < splitted.length; j++) {
                if (result[i - 1].charAt(result[i - 1].length() - 1) == splitted[j].charAt(0)) {
                    result[i] = splitted[j];
                }
            }
        }
        for (String s : result)
            System.out.print(s + " ");
    }


}
