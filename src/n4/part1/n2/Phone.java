package n4.part1.n2;

public class Phone {
    private int number;
    private String model;
    private double weight;

    Phone(int number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    Phone(int number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 132;
    }

    Phone() {
        this.number = 892637567;
        this.model = "HTC";
        this.weight = 124;
    }

    public void receiveCall(String callerName) {
        System.out.printf("Call from %s\n", callerName);
    }

    public void receiveCall(String callerName, int callerPhone) {
        System.out.printf("Call from %s. number: %d\n", callerName, callerPhone);
    }

    public void sendMessage(int[] numbers, int length) {
        for (int i = 0; i < length; i++)
            System.out.printf("Message to %d\n", numbers[i]);
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Phone{ model: "+getModel()+", weight: "+getWeight()+", number: "+getNumber()+"}";
    }
}
