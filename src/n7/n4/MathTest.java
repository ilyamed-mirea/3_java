package n7.n4;

public class MathTest {
    public static void main(String[] args) {
        MathCalculable mathCalculable = new MathFunc();
        System.out.println(mathCalculable.PI);
        System.out.println(mathCalculable.square(5));
        System.out.println(mathCalculable.module(-5));
        System.out.println(mathCalculable.getArea(5));
    }
}
