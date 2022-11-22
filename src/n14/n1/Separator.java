package n14.n1;

import java.util.Scanner;

public class Separator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = scanner.nextLine();
        String[] splitted = input.split(regex);
        for (String s : splitted) {
            System.out.println(s);
        }
    }
}
