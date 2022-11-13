package n11.n3;

import java.util.Calendar;
import java.util.Date;

public class Tester {
    private Student student = new Student("ilya", "m", "IT", 1, 1, "groupId", new Date(2022-1900, Calendar.MAY,26));

    public static void main(String[] args) {
        Tester tester = new Tester();
        System.out.println(tester.student.toString());
    }
}
