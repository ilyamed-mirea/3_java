package n1;

import java.util.Scanner;

public class n1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write array length");
        int len = scanner.nextInt();
        int[] intArray = new int[len];
        int sum = 0;
        float sr;

        for (int i = 0; i < len; i++) {
            System.out.printf("Write array element %d ", i + 1);
            int el = scanner.nextInt();
            intArray[i] = el;
        }
        for (int j : intArray) {
            sum += j;
        }
        sr = ((float)sum / (float)len);

        System.out.printf("sum: %d \n", sum);
        System.out.printf("sredn arifm: %.2f", sr);
    }
}