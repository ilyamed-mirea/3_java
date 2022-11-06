package n4.part1.n8;

public class Circle extends Shape {
    private static final double PI = 3.141592653589793;
    private static double radius;

    public Circle(String color, boolean filled, int radius) {
        super(color, filled);
        this.radius = radius;
    }

    public static double getRadius() {
        return radius;
    }

    public static void setRadius(double radius) {
        Circle.radius = radius;
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
                "color='" + color + '\'' +
                "radius='" + radius + '\'' +
                ", filled=" + filled +
                '}';
    }
}
