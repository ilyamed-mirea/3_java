package n4.part1.n1;

public class ShapeTest {
    public static void main(String[] args) {
        Shape circle = new Circle(12);
        Shape rect = new Rectangle(12.3, 7);
        Shape square = new Square(4.3, 2.5);

        System.out.println(circle);
        System.out.println("circle area: " + circle.getArea());
        System.out.println("circle perimeter: " + circle.getPerimeter());

        System.out.println(rect);
        System.out.println("rectangle area: " + rect.getArea());
        System.out.println("rectangle perimeter: " + rect.getPerimeter());

        System.out.println(square);
        System.out.println("square area: " + square.getArea());
        System.out.println("square perimeter: " + square.getPerimeter());
    }
}
