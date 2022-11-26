package n18.n2;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        System.out.println(2 / i);
    }
    //input: Qwerty 0 1.2 1
    /* output:
    Exception in thread "main" java.lang.NumberFormatException: For input string: "Qwerty"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Integer.parseInt(Integer.java:668)
	at java.base/java.lang.Integer.parseInt(Integer.java:784)
	at n18.n2.Exception2.exceptionDemo(Exception2.java:10)
	at n18.n2.Exception2.main(Exception2.java:16)

    Process finished with exit code 1
     */
    //description: NumberFormatException because of String input

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
        }
    }

    public static void main(String[] args) {
        Exception2 exception2 = new Exception2();
//        exception2.exceptionDemo();
        exception2.exceptionDemo2();
    }
}
