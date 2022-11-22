package n14.n8;

public class Tester {
    public static void main(String[] args) {
        Filtrator filtrator = new Filtrator();
        filtrator.apply(filtrator.testStr);
        System.out.println(filtrator.toString());
    }
}
