package n4.part1.n6;

public class Manager extends Employeer {
    private double averageSum;

    public Manager(String firstName, String lastName, double income, double averageSum) {
        super(firstName, lastName, income);
        this.averageSum = averageSum;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "averageSum=" + getAverageSum() +
                ", payed="+getIncome()+
                '}';
    }

    public double getAverageSum() {
        return averageSum;
    }

    public void setAverageSum(double averageSum) {
        this.averageSum = averageSum;
    }

    @Override
    public double getIncome() {
        return super.getIncome() + averageSum;
    }
}
