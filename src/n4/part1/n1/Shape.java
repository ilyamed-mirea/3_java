package n4.part1.n1;

public class Shape {

    String type;

    Shape(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "type='" + type + '\'' +
                '}';
    }
}
