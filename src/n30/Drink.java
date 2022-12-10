package n30;

final class Drink extends MenuItem implements Alcoholable {
    private String name;
    private int price;
    private String description;

    private double alcoholVol;
    private DrinkTypeEnum type;

    public Drink(String name, int price, String description, double alcoholVol, DrinkTypeEnum type) {
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
        if (alcoholVol < 0) {
            throw new IllegalArgumentException("Alcohol volume can't be negative");
        }
        if (type == null) {
            throw new IllegalArgumentException("Type can't be null");
        }
        this.name = name;
        this.price = price;
        this.description = description;
        this.alcoholVol = alcoholVol;
        this.type = type;
    }

    public Drink(String item) {
        super(item.split((";"))[0], item.split((";"))[1], Integer.parseInt(item.split((";"))[2]), 0);
        String[] parts = item.split(";");
        if (parts.length != 5) {
            throw new IllegalArgumentException("Wrong format");
        }
        this.name = parts[0];
        this.price = Integer.parseInt(parts[1]);
        this.description = parts[2];
        this.alcoholVol = Double.parseDouble(parts[3]);
        this.type = DrinkTypeEnum.valueOf(parts[4]);
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

    public DrinkTypeEnum getType() {
        return type;
    }

    @Override
    public boolean isAlcoholicDrink() {
        return alcoholVol > 0;
    }

    @Override
    public double getAlcoholVol() {
        return alcoholVol;
    }

    @Override
    public String toString() {
        return "Drink{" + "name=" + name + ", price=" + price + ", description=" + description + ", alcoholVol=" + alcoholVol + ", type=" + type + '}';
    }
}
