package n2;

import java.util.Calendar;
import java.util.Date;

public class Book {
    private String author;
    private String title;
    private Calendar date;

    public Book(String author, String title, Calendar date) {
        this.author = author;
        this.title = title;
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public Date getDate() {
        return date.getTime();
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Book {\n" +
                "author='" + getAuthor() + "' \n" +
                "title='" + getTitle() + "' \n" +
                "date=" + getDate() +
                "\n}\n";
    }
}