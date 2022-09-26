package n1;

import java.util.Scanner;

public class n2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write array length");
        int len = scanner.nextInt();
        int[] intArray = new int[len];
        int summWhile = 0, summDoWhile = 0;

        for (int i = 0; i < len; i++) {
            System.out.printf("Write array element %d ", i + 1);
            int el = scanner.nextInt();
            intArray[i] = el;
        }
        int max = intArray[0], min = intArray[0];

        int i = 0;
        while (i < intArray.length) {
            if (intArray[i] > max) max = intArray[i];
            summWhile += intArray[i];
            i++;
        }
        System.out.printf("summ while: %d", summWhile);
        i = 0;
        do {
            if (intArray[i] < min) min = intArray[i];
            summDoWhile += intArray[i];
            i++;
        } while (i < intArray.length);
        System.out.printf("summ do while: %d", summDoWhile);


        System.out.printf("max: %d", max);
        System.out.printf("min: %d", min);
    }
}
