package n24.n2;

public class VictorianChair implements IChair {
    private int age;

    public VictorianChair(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void hasLegs() {
        System.out.println("VictorianChair has legs");
    }

    @Override
    public void sitOn() {
        System.out.println("VictorianChair sit on");
    }

    @Override
    public void standUp() {
        System.out.println("VictorianChair stand up");
    }
}
