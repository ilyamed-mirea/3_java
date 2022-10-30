package n2;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Gete", "biser", new GregorianCalendar(1976, 10, 3));
        System.out.println(book);
    }
}
