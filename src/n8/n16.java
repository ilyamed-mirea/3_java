package n8;

import java.util.ArrayList;
import java.util.Scanner;

public class n16 {
    static Scanner scanner = new Scanner(System.in);
    public static int maxCount(ArrayList<Integer> arr) {
        int inp = scanner.nextInt();
        if (inp == 0) {
            int max = -1000000;
            int count = 0;
            //find max element
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i) > max) {
                    max = arr.get(i);
                }
            }
            //calculate how many times max element is in array
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i) == max) {
                    count++;
                }
            }
            return count;
        } else {
            arr.add(inp);
            return maxCount(arr);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println(maxCount(arr));
    }
}
