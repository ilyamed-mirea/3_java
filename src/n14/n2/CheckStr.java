package n14.n2;

import java.util.Scanner;

public class CheckStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input.matches("^abcdefghijklmnopqrstuv18340$"));

    }
}
