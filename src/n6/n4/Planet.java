package n6.n4;

import n6.n3.Nameable;

public class Planet implements Priceable {
    private double price;

    public Planet(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}