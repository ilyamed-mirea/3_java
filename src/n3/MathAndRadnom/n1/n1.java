package n3.MathAndRadnom.n1;

import java.util.*;

public class n1 {
    static int length = 10;

    private static void sortArr(double[] numbers) {
        for (int i = 0; i < length - 1; i++)
            for (int j = i + 1; j < length; j++)
                if (numbers[i] > numbers[j]) {
                    double temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
    }

    private static void printArr(double[] numbers) {
        for (int i = 0; i < length; i++)
            System.out.printf("%.2f ", numbers[i]);
        System.out.println();
    }

    public static void main(String[] args) {
        double[] randomNumbers = new double[length];
        //via Math.random()
        System.out.println("Math.random():\n");
        for (int i = 0; i < length; i++)
            randomNumbers[i] = Math.random();
        printArr(randomNumbers);
        sortArr(randomNumbers);
        printArr(randomNumbers);

        //via Random
        System.out.println("\nClass Random:\n");
        Random rand = new Random();
        for (int i = 0; i < length; i++)
            randomNumbers[i] = rand.nextDouble();
        printArr(randomNumbers);
        sortArr(randomNumbers);
        printArr(randomNumbers);
    }
}
