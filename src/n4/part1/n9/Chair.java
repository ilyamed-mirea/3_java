package n4.part1.n9;

public class Chair extends Furniture {
    private static double chairPrice = 1432.3;
    private int amount = 16;

    public Chair(String color) {
        super(chairPrice, color);
    }

    public static double getChairPrice() {
        return chairPrice;
    }

    public static void setChairPrice(double chairPrice) {
        Chair.chairPrice = chairPrice;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "amount= " + amount +
                " color=" + getColor() +
                '}';
    }
}
