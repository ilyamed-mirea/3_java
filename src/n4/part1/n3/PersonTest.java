package n4.part1.n3;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("Krabov Nikolai Dmitrievich", 12, 165);
        Person person2 = new Person();

        person1.move();
        System.out.println();
        person2.talk();
    }
}
