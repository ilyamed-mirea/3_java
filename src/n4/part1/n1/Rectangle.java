package n4.part1.n1;

public class Rectangle extends Shape {
    private static double a;
    private static double b;

    Rectangle(double a, double b) {
        super("Rectangle");
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
        return "Rectangle{" +
                "type='" + type + '\'' +
                "a='" + a + '\'' +
                "b='" + b + '\'' +
                '}';
    }
}
