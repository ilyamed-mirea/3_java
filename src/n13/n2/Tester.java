package n13.n2;

public class Tester {
    public static void main(String[] args) {
        String name = "ilya";
        String lastname = "medvedev";
        String lastlastname = "V";

        Person people = new Person(name, null, lastname);
        Person people2 = new Person(name, lastlastname, null);
        Person people3 = new Person(null, lastlastname, null);

        people.print();
        people2.print();
        people3.print();
    }
}
