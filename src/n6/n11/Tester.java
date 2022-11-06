package n6.n11;

public class Tester {
    public static void main(String[] args) {
        Convertable[] convertables = new Convertable[2];
        convertables[0] = new Farenheit();
        convertables[1] = new Celcius();
        System.out.println("F = " + convertables[0].convert(100) + "\nC" + " = " + convertables[1].convert(convertables[0].convert(100)));
    }
}
