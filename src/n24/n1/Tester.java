package n24.n1;

public class Tester {
    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcreteFactory();
        Complex complex1 = factory.createComplex();
        Complex complex2 = factory.createComplex(1, 2);
        Complex complex3 = factory.createComplex(3, 4);
        System.out.println(complex1);
        complex1.add(complex2);
        System.out.println(complex1);
        complex1.sub(complex3);
        System.out.println(complex1);
    }
}
