package n2;

public class Circle2 {
    public static final double PI = 3.141592653589793;
    public double radius = 1.0;

    Circle2(double radius) {
        this.radius=radius;
    }

    Circle2() {}

    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius=radius;
    }
    public double calculateLength() {
        return PI*radius*2;
    }
    public double calculateSquare() {
        return PI*radius*radius;
    }

    public boolean isCircleEqual(Circle2 circle2) {
        return getRadius()==circle2.getRadius();
    }

    @Override
    public String toString() {
        return "Circle radius: "+getRadius()+", square: "+calculateSquare()+", length: "+calculateLength();
    }
}
