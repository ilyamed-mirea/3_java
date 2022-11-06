package n4.part1.n1;

public class Square extends Shape {
    private static double a;
    private static double b;

    Square(double a, double b) {
        super("Square");
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return 2 * (a + b);
    }

    @Override
    public String toString() {
        return "Square{" +
                "type='" + type + '\'' +
                "a='" + a + '\'' +
                "b='" + b + '\'' +
                '}';
    }
}
