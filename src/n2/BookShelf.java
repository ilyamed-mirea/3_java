package n2;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Objects;

public class BookShelf {
    private Book[] shelf;
    private int length;

    public BookShelf(Book[] inputShelf, int length) {
        if (length < 0)
            length = 1;
        this.length = length;
        this.shelf = new Book[length];
        System.arraycopy(inputShelf, 0, shelf, 0, length);
    }

    public BookShelf() {
        this.length = 50;
        this.shelf = new Book[this.length];
    }

    public void add(Book book) {
            this.length++;
            Book[] newShelf = new Book[length];
            System.arraycopy(shelf, 0, newShelf, 0, length-1);
            newShelf[length] = book;
            shelf = newShelf;
    }

    public Book findLatest() {
        if (length == 0) {
            return null;
        }
        Book answer = shelf[0];
        for (int i = 1; i < length; i++) {
            if (shelf[i].getDate().after(answer.getDate())) {
                answer = shelf[i];
            }
        }
        return answer;
    }

    public Book findEarliest() {
        if (length == 0) {
            return null;
        }
        Book answer = shelf[0];
        for (int i = 1; i < length; i++) {
            if (shelf[i].getDate().before(answer.getDate())) {
                answer = shelf[i];
            }
        }
        return answer;
    }

    public void makeOrdered() {
        Arrays.sort(shelf, 0, length, (a, b) -> {
            if (a.getDate().before(b.getDate())) {
                return -1;
            }
            else if (a.getDate().after(b.getDate())) {
                return 1;
            }
            return 0;
        });
    }

    public Book[] getShelf() {
        return shelf;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\n");
        Arrays.stream(shelf).filter(Objects::nonNull).forEach(i -> sb.append(i.toString()).append(",\n"));
        return "BookShelf{" +
                "\nshelf=" + sb +
                "\nlength=" + length +
                "\n}";
    }

    public Book createBook(String author, String title, Calendar date) {
        return new Book(author, title, date);
    }
}
