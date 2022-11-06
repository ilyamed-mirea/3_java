package n4.part1.n8;

public class Square extends Shape {
    private double a;

    public Square(String color, boolean filled, double a) {
        super(color,filled);
        this.a = a;
    }

    @Override
    public double getArea() {
        return a * a;
    }

    @Override
    public double getPerimeter() {
        return 2 * (a + a);
    }

    @Override
    public String toString() {
        return "Square{" +
                "a='" + a + '\'' +
                '}';
    }
}
