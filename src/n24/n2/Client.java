package n24.n2;

public class Client {
    private IChair chair;

    public Client(IChair chair) {
        this.chair = chair;
    }

    public IChair getChair() {
        return chair;
    }

    public void sitOn() {
        chair.sitOn();
    }

    public void standUp() {
        chair.standUp();
    }

    public void checkLegs() {
        chair.hasLegs();
    }
}
