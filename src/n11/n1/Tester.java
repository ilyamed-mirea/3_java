package n11.n1;

import java.util.Calendar;
import java.util.Date;

public class Tester {
    private String name = "Ilya";
    private Date startTaskDate = new Date(2022, Calendar.DECEMBER,14);
    private Date endTaskDate = new Date();

    public static void main(String[] args) {
        Tester tester = new Tester();
        System.out.println(tester.name);
        System.out.println(tester.startTaskDate);
        System.out.println(tester.endTaskDate);
    }
}
