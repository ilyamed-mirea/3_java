package n18.n3;

import n18.n2.Exception2;

import java.util.Scanner;

public class Exception22 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        try {
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
    }

    public static void main(String[] args) {
        n18.n2.Exception2 exception2 = new n18.n2.Exception2();
        exception2.exceptionDemo();
    }

}
