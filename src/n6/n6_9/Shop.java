package n6.n6_9;

public class Shop implements Printable {
    private static Printable[] printables = new Printable[3];

    public void print() {
        for (Printable printable : printables) {
            printable.print();
        }
    }

    public static void main(String[] args) {
        printables[0] = new Book("Java");
        printables[1] = new Book("C");
        printables[2] = new Book("JavaScript");
        Shop shop = new Shop();
        shop.print();
    }
}
