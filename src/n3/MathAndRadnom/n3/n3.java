package n3.MathAndRadnom.n3;

import java.util.Random;

public class n3 {
    static int[] numbers = new int[4];
    static boolean nextMoreThanPrev = false;

    private static void printInRow() {
        for (int i = 0; i < 4; i++)
            System.out.printf("%d ", numbers[i]);
    }

    private static void checkIsUpper() {
        nextMoreThanPrev = true;
        for (int i = 1; i < 4; i++)
            if (numbers[i] < numbers[i - 1]) {
                nextMoreThanPrev = false;
                break;
            }
        System.out.println();
        System.out.println(nextMoreThanPrev);
    }

    public static void main(String[] args) {
        while (!nextMoreThanPrev) {
            Random rand = new Random();
            for (int i = 0; i < 4; i++)
                numbers[i] = rand.nextInt(90) + 10;
            printInRow();
            checkIsUpper();
        }
    }
}
