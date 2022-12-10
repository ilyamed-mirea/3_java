package n29;

public class Drink implements Item {
    private final String name;
    private final int price;
    private final String description;

    public Drink(String name, int price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
