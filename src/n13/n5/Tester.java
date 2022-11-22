package n13.n5;

public class Tester {
    public static void main(String[] args) {
        String number1 = "+79175655655";
        String number2 = "+104289652211";
        String number3 = "89175655655";
        Mobile mobile1 = new Mobile(number1);
        Mobile mobile2 = new Mobile(number2);
        Mobile mobile3 = new Mobile(number3);
        System.out.println(mobile1.number);
        System.out.println(mobile2.number);
        System.out.println(mobile3.number);
    }
}
