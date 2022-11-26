package n18.n4;

import java.util.Scanner;

public class Exception4 {
    public void exceptionDemo2() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        try {
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        } catch (NumberFormatException e) {
            System.out.println("Number format exception");
        } finally {
            System.out.println("Finally block executed");
        }
    }

    public static void main(String[] args) {
        Exception4 exception2 = new Exception4();
        exception2.exceptionDemo2();
    }
}
