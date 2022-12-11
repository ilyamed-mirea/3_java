package n8;

import java.util.Scanner;

public class n17 {
    static Scanner scanner = new Scanner(System.in);
    public static int max(int max) {
        int inp = scanner.nextInt();
        if (inp == 0) {
            return max;
        } else {
            if (inp > max) {
                return max(inp);
            }
            else return max(max);
        }
    }

    public static void main(String[] args) {
        System.out.println(max(-1000000));
    }
}
