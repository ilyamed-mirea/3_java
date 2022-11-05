package n3.MathAndRadnom.n4;

import java.util.Random;
import java.util.Scanner;

public class n4 {
    private static int n = -1;
    private static int evensN = 0;
    private static int[] arr;
    private static int[] arrEven;

    private static void printInRow(int[] arrr, int length) {
        for (int i = 0; i < length; i++)
            System.out.printf("%d ", arrr[i]);
        System.out.println();
    }

    private static void formArr() {
        Random rand = new Random();
        for (int i = 0; i < n; i++)
            arr[i] = rand.nextInt(n + 1);
    }

    private static void formEvenArr() {
        for (int i = 0; i < n; i++)
            if (arr[i] % 2 == 0)
                evensN++;
        arrEven = new int[evensN];
        for (int i = 0, j = 0; i < n; i++)
            if (arr[i] % 2 == 0)
                arrEven[j++] = arr[i];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (n <= 0) {
            System.out.println("write n: ");
            n = sc.nextInt();
        }
        arr = new int[n];
        formArr();
        printInRow(arr, n);
        formEvenArr();
        printInRow(arrEven, evensN);
    }
}
