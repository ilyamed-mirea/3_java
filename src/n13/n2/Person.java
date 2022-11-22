package n13.n2;

public class Person {

    StringBuilder fio;

    public Person(String name, String lastlastname, String lastname) {
        this.fio = new StringBuilder().append(name == null ? "" : name).append(lastlastname == null ? "" : lastlastname).append(lastname == null ? "" : lastname);
    }

    void print() {
        System.out.println(fio);
    }
}
