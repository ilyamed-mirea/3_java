package n4.part1.n5;

public class Reader {
    private String fullname;
    private int id;
    private String institute;
    private String date;
    private int number;

    public Reader(String fullname, Integer number, String institute, String date, int mobileNumber) {
        this.fullname = fullname;
        this.id = number;
        this.institute = institute;
        this.date = date;
        this.number = mobileNumber;
    }

    public void takeBook(int counter) {
        System.out.println(fullname + " take " + counter + " books");
    }

    public void takeBook(String[] books) {
        System.out.println(fullname + " take this books:");
        for (String i : books)
            System.out.println(i);
    }

    public void returnBook(int counter) {
        System.out.println(fullname + " return " + counter + " books");
    }

    public void returnBook(String[] books) {
        System.out.println(fullname + " return this books:");
        for (String i : books)
            System.out.println(i);
    }
}
