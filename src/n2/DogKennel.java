package n2;

import java.util.ArrayList;
import java.util.Scanner;

public class DogKennel {
    private static ArrayList<Dog> dogs = new ArrayList<Dog>();

    public static void main(String[] args) {
        System.out.println("Сколько собак хотите добавить?");
        Scanner sc = new Scanner(System.in);
        int colv = sc.nextInt();
        for (int i=0;i<=colv;i++) {
            sc.nextLine();
            System.out.println("Введите имя: ");
            String name = sc.nextLine();
            System.out.println("Введите Возраст: ");
            int age = sc.nextInt();
            dogs.add(new Dog(name,age));
        }
        for (int i=0;i< dogs.size();i++)
            System.out.println(dogs.get(i).ToString());
        sc.close();
    }
}
