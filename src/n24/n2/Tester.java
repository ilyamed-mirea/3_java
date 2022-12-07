package n24.n2;

public class Tester {
    public static void main(String[] args) {
        IAbsctractChairFactory factory = new ChairFactory();
        Client client = new Client(factory.createFunctionalChair());
        client.sitOn();
        client.standUp();
        client.checkLegs();

        Client client2 = new Client(factory.createMagicChair());
        client2.sitOn();
        client2.standUp();
        client2.checkLegs();
        MagicChair mc = (MagicChair) client2.getChair();
        mc.doMagic();
    }
}
