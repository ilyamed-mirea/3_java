package n11.n2;

import java.util.Date;
import java.util.Scanner;

public class Tester {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // write get date from user input
        System.out.println("Enter day:");
        int day = scanner.nextInt();
        System.out.println("Enter month:");
        int month = scanner.nextInt();
        System.out.println("Enter year:");
        int year = scanner.nextInt();

        Date date = new Date(day, month, year);
        System.out.println(date.compareTo(new Date())>0 ? "Future date" : "Past date");

    }
}
