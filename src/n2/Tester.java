package n2;

public class Tester {
    private static int circlesCount = 0;
    private static Circle[] circles = new Circle[10];
    public static void main(String[] args) {
        Circle circle = new Circle();
        circles[0] = circle;
        circlesCount++;
        circles[0].setX(12);
        circle = new Circle(1,2);
        circles[1] = circle;
        circlesCount++;
        for (int i = 0; i < circlesCount; i++)
            System.out.println(circles[i]);
    }
}
