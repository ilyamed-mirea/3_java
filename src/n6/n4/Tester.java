package n6.n4;

import n6.n3.Nameable;

public class Tester {
    public static void main(String[] args) {
        Priceable car = new Car(1000);
        Priceable planet = new Planet(10567);
        System.out.println(car.getPrice());
        System.out.println(planet.getPrice());
    }
}
