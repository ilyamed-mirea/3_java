package n3.MathAndRadnom.n2;

public class Circle {
    private static final double PI = 3.141592653589793;
    private Point center;
    private double radius;
    private double length;

    Circle(double centerX, double centerY) {
        this.center = new Point(centerX, centerY);
        this.radius = Math.random() * 100;
        this.length = PI * radius * 2;
    }
    Circle(double centerX, double centerY,double radius) {
        this.center = new Point(centerX, centerY);
        this.radius = radius;
        this.length = PI * radius * 2;
    }
    public Circle() {
        this.center = new Point(Math.random() * 10, Math.random() * 10);
        this.radius = Math.random() * 100;
        this.length = PI * radius * 2;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double calculateSquare() {
        return PI * radius * radius;
    }

    public boolean isCircleEqual(Circle circle2) {
        return getRadius() == circle2.getRadius();
    }

    @Override
    public String toString() {
        return "Circle radius: " + getRadius() + ", square: " + calculateSquare() + ", length: " + getLength() + ", center" + getCenter();
    }
}
