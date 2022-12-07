package n24.n2;

public class FunctionalChair implements IChair {
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public void hasLegs() {
        System.out.println("FunctionalChair has legs");
    }

    @Override
    public void sitOn() {
        System.out.println("FunctionalChair sit on");
    }

    @Override
    public void standUp() {
        System.out.println("FunctionalChair stand up");
    }
}
