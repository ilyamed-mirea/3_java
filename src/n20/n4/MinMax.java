package n20.n4;

import java.util.ArrayList;
import java.util.Scanner;

public class MinMax<T> {
    T[] array;

    //constructor
    public MinMax(T[] array) {
        this.array = array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        Integer[] array = new Integer[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        MinMax<Integer> minMax = new MinMax<Integer>(array);
        Integer[] res = minMax.findMinMax(minMax.array);
        System.out.println("min: " + res[0]);
        System.out.println("max: " + res[1]);
    }

    //method to find min and max elements in array
    public T[] findMinMax(T[] array) {
        T min = array[0];
        T max = array[0];
        for (int i = 0; i < array.length; i++) {
            if ((Integer) array[i] < (Integer) min) {
                min = array[i];
            }
            if ((Integer) array[i] > (Integer) max) {
                max = array[i];
            }
        }
        array[0] = min;
        array[1] = max;
        return array;
    }
}