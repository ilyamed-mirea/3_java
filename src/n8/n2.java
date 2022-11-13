package n8;

import java.util.ArrayList;

public class n2 {
    static ArrayList<Integer> getFrom1ToN(ArrayList<Integer> arr, int n) {
        if (n == 0) {
            return arr;
        } else {
            arr.add(n);
            return getFrom1ToN(arr, n - 1);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        getFrom1ToN(arr, 10);
    }
}
