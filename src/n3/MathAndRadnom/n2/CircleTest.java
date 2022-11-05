package n3.MathAndRadnom.n2;

public class CircleTest {
    private static final int length = 10;
    private static Circle[] circles = new Circle[length];

    private static Circle findSmallestCircle() {
        Circle smallest = circles[0];
        for (int i = 0; i < length; i++) {
            if (circles[i].getRadius() < smallest.getRadius())
                smallest = circles[i];
        }
        return smallest;
    }

    private static Circle findBiggestCircle() {
        Circle biggest = circles[0];
        for (int i = 0; i < length; i++) {
            if (circles[i].getRadius() > biggest.getRadius())
                biggest = circles[i];
        }
        return biggest;
    }

    private static void sortCircles() {
        for (int i = 0; i < length - 1; i++)
            for (int j = i + 1; j < length; j++)
                if (circles[i].getRadius() > circles[j].getRadius()) {
                    Circle temp = circles[i];
                    circles[i] = circles[j];
                    circles[j] = temp;
                }
    }

    private static void printCircles() {
        for (int i = 0; i < length; i++)
            System.out.println(circles[i]);
        System.out.println();
    }

    public static void main(String[] args) {
        for (int i = 0; i < length; i++)
            circles[i] = new Circle();
        System.out.println("-------------------PRINT CIRCLES----------------");
        printCircles();
        sortCircles();
        System.out.println("-------------------PRINT SORTED CIRCLES----------------");
        printCircles();
        Circle small = findSmallestCircle();
        Circle big = findBiggestCircle();
        System.out.println("-------------------SMALLEST CIRCLE----------------");
        System.out.println(small);
        System.out.println("-------------------BIGGEST CIRCLE----------------");
        System.out.println(big);
    }
}
