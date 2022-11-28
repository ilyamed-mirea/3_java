package n20.n42;

public class Calc {
    //write calc with functions sum, multiply, divide, subtraction

    public static void main(String[] args) {
        System.out.println(sum(1, 2.2));
        System.out.println(multiply(1, 2.2));
        System.out.println(divide(1, 2.2));
        System.out.println(subtraction(1, 2.2));
    }

    public static <N> double sum(N t, N v) {
        return Double.parseDouble(t.toString()) + Double.parseDouble(v.toString());
    }

    public static <N> double multiply(N t, N v) {
        return Double.parseDouble(t.toString()) * Double.parseDouble(v.toString());
    }

    public static <N> double divide(N t, N v) {
        return Double.parseDouble(t.toString()) / Double.parseDouble(v.toString());
    }

    public static <N> double subtraction(N t, N v) {
        return Double.parseDouble(t.toString()) - Double.parseDouble(v.toString());
    }
}
