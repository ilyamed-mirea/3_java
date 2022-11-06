package n4.part1.n9;

abstract class Furniture {
    protected double price;
    protected String color;

    public Furniture(double price, String color) {
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
