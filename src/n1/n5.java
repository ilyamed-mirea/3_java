package n1;

import java.util.Scanner;

public class n5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write number ");
        int num = scanner.nextInt();
        int fact = 1;
        for (; num > 0; num--) {
            fact *= num;
        }
        System.out.printf("factorial: %d", fact);
    }
}
