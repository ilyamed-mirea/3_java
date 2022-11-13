package n7.n7_8;

public class Magazine implements Printable {
    private static Printable[] printables = new Printable[3];

    public void print() {
        for (Printable printable : printables) {
            printable.print();
        }
    }

    public static void printMagazines(Printable[] printables) {
        for (Printable printable : printables) {
            if (printable instanceof Magazine) {
                printable.print();
            }
        }
    }

    public static void main(String[] args) {
        printables[0] = new Book("Java");
        printables[1] = new Book("C");
        printables[2] = new Book("JavaScript");
        Magazine magazine = new Magazine();
        printMagazines(magazine.printables);
        Book.printBooks(magazine.printables);
    }
}
