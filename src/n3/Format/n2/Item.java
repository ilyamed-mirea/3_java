package n3.Format.n2;

public class Item {

    private String name;
    private int amount;
    private double eurPrice;
    private double usdPrice;
    private double rubPrice;

    public Item(String name, int amount, double eurPrice, double usdPrice, double rubPrice) {
        this.name = name;
        this.amount = amount;
        this.eurPrice = eurPrice;
        this.usdPrice = usdPrice;
        this.rubPrice = rubPrice;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEurPrice() {
        return eurPrice;
    }

    public void setEurPrice(double eurPrice) {
        this.eurPrice = eurPrice;
    }

    public double getUsdPrice() {
        return usdPrice;
    }

    public void setUsdPrice(double usdPrice) {
        this.usdPrice = usdPrice;
    }

    public double getRubPrice() {
        return rubPrice;
    }

    public void setRubPrice(double rubPrice) {
        this.rubPrice = rubPrice;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", eurPrice=" + eurPrice +
                ", usdPrice=" + usdPrice +
                ", rubPrice=" + rubPrice +
                '}';
    }
}
