package n4.part1.n1;

public class Circle extends Shape {
    private static final double PI = 3.141592653589793;
    private static double radius;

    Circle(int radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return PI * radius * 2;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "type='" + type + '\'' +
                "radius='" + radius + '\'' +
                '}';
    }
}
