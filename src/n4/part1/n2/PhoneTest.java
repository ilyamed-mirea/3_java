package n4.part1.n2;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone1 = new Phone(12456543,"SAMSUNG",123.3);
        Phone phone2 = new Phone(21344321,"APPLE");
        Phone phone3 = new Phone();

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        phone1.receiveCall("Gregory");
        phone2.receiveCall("Nikolai");
        phone3.receiveCall("Artem");

        phone1.receiveCall("Gregory",63254654);
        phone2.receiveCall("Nikolai",75834695);
        phone3.receiveCall("Artem",67835467);

        phone1.sendMessage(new int[]{2453453,768878,345234},3);



    }
}
