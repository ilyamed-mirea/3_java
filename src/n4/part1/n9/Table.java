package n4.part1.n9;

public class Table extends Furniture{
    private static double tablePrice = 1432.3;
    private int amount = 26;

    public Table(String color) {
        super(tablePrice, color);
    }

    public static double getTablePrice() {
        return tablePrice;
    }

    public static void setTablePrice(double tablePrice) {
        Table.tablePrice = tablePrice;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Table{" +
                "amount=" + amount +
        " color=" + getColor() +
                '}';
    }
}
