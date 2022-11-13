package n11.n4;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Tester {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String[] firstLine = scanner.nextLine().split(" ");
        String[] secondLine = scanner.nextLine().split(" ");
        int year = Integer.parseInt(firstLine[0]);
        int month = Integer.parseInt(firstLine[1]);
        int day = Integer.parseInt(firstLine[2]);
        int hour = Integer.parseInt(secondLine[0]);
        int minute = Integer.parseInt(secondLine[1]);
        Date date = new Date(year-1900, month, day, hour, minute);
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day, hour, minute);

        System.out.println(date);
        System.out.println(calendar.getTime());
    }
}
