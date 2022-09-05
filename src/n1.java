import java.util.Scanner;

public class n1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write array length");
        int len = scanner.nextInt();
        int intArray[] = new int[len];

        for(int i = 0; i < len; i++){
            System.out.print("Write array ");
            System.out.println(i+1);
            int el = scanner.nextInt();
            intArray[i] = el;
        }

        int summFor = 0;
        int summWhile = 0;
        int summDoWhile = 0;
        for (int j : intArray) {
            summFor += j;
        }
        System.out.println(summFor);
        int i = 0;
        while(i < intArray.length){
            summWhile += intArray[i];
            i++;
        }
        System.out.println(summWhile);
        i = 0;
        do {
            summDoWhile += intArray[i];
            i++;
        } while(i < intArray.length);
        System.out.println(summDoWhile);
    }
}