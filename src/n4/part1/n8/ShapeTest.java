package n4.part1.n8;

public class ShapeTest {
    public static void main(String[] args) {
        Shape circle = new Circle("red",true,12);
        Shape rect = new Rectangle("green",false,12.3, 7);

        System.out.println(circle);
        System.out.println("circle area: " + circle.getArea());
        System.out.println("circle perimeter: " + circle.getPerimeter());

        System.out.println();

        System.out.println(rect);
        System.out.println("rectangle area: " + rect.getArea());
        System.out.println("rectangle perimeter: " + rect.getPerimeter());
    }
}
