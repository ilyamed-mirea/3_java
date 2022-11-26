package n18.n1;

public class Exception1 {
    public void exceptionDemo0() {
        System.out.println(2 / 0);
    }
    /* error:
    Exception in thread "main" java.lang.ArithmeticException: / by zero
	at n18.n1.Exception1.exceptionDemo(Exception1.java:5)
	at n18.n1.Exception1.main(Exception1.java:10)
     */

    public void exceptionDemo1() {
        System.out.println(2.0 / 0.0);
    }
    /*
    output: Infinity
     */

    public void exceptionDemo2() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }
    /*
    output: Attempted division by zero
     */

    public static void main(String[] args) {
        Exception1 exception1 = new Exception1();
//        exception1.exceptionDemo0();
//        exception1.exceptionDemo1();
        exception1.exceptionDemo2();
    }
}
