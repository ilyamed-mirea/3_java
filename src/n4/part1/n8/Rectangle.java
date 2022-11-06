package n4.part1.n8;

public class Rectangle extends Shape {
    private static double a;
    private static double b;

    public Rectangle(String color, boolean filled, double a, double b) {
        super(color, filled);
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
                "a='" + a + '\'' +
                "b='" + b + '\'' +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
