package n6.n3;

public class Tester {
    public static void main(String[] args) {
        Nameable[] nameables = new Nameable[2];
        nameables[0] = new Car("Audi");
        nameables[1] = new Planet("Earth");
        for (Nameable nameable : nameables) {
            System.out.println(nameable.getName());
        }
    }
}
