package n4.part1.n5;

public class ReaderTest {
    public static void main(String[] args) {
        Reader reader = new Reader("Mihail", 312, "IT", "06.11.2002", 72827354);
        reader.takeBook(2);
        reader.takeBook(new String[]{"book1", "book2"});

        reader.returnBook(3);
        reader.returnBook(new String[]{"book1", "book2","book3"});

    }
}
