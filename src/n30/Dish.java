package n30;

final class Dish extends MenuItem {
    private final String name;
    private final int price;
    private final String description;

    public Dish(String name, int price, String description) {
        super(name, description, price, 0);
        if (price < 0) {
            throw new IllegalArgumentException("Price can't be negative");
        }
        if (name == null) {
            throw new IllegalArgumentException("Name can't be null");
        }
        if (description == null) {
            throw new IllegalArgumentException("Description can't be null");
        }
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
