package n2;

import java.util.Scanner;

public class Dog {
    private String name;
    private int age;

    public void setAge(int age) {
this.age=age;
    }

    public void setName(String name) {
        this.name = name;
    }

    Dog(String name, int age) {
        setName(name);
        setAge(age);
    }

    public int convertToHumanAge() {
        return age*7;
    }

    public String ToString() {
        return "Dog "+this.age+" "+this.name;
    }
}
