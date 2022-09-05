import java.util.Arrays;
import java.util.Random;

public class n3 {
    static void printArr(int arr[]) {
        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
        System.out.println("arr end");
    }
    public static void main(String[] args) {
        //v1
        int randArr[] = new int[10];
        for (int i=0;i<randArr.length;i++) {
            randArr[i] = (int)(1+Math.random()*100);
        }

        printArr(randArr);

        System.out.println("sorted:");
        Arrays.sort(randArr);

        printArr(randArr);
    }
}
