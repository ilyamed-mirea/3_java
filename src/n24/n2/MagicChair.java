package n24.n2;

public class MagicChair implements IChair {
    public void doMagic() {
        System.out.println("Magic happened!");
    }

    @Override
    public void hasLegs() {
        System.out.println("MagicChair has legs");
    }

    @Override
    public void sitOn() {
        System.out.println("MagicChair sit on");
    }

    @Override
    public void standUp() {
        System.out.println("MagicChair stand up");
    }
}
