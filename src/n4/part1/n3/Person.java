package n4.part1.n3;

public class Person {
    private String fullname;
    private int age;
    private double height;

    public Person(String fullname, int age, double height) {
        this.fullname = fullname;
        this.age = age;
        this.height = height;
    }

    public Person() {
        this.fullname = "Ignatov Semen Danilovich";
        this.age = 121;
        this.height = 178.4;
    }

    public void move() {
        System.out.printf("%s is walking", fullname);
    }

    public void talk() {
        System.out.printf("%s is talking", fullname);
    }
}
