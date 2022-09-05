import java.util.Scanner;

public class n4 {
    static String convertCC(int ten,int to) {
    String abc = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String result = "";
        while (ten!=0) {
            int i = ten%to;
            result = abc.charAt(i)+result;
            ten /= to;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write num");
        int num = sc.nextInt();
        System.out.println("Write target system");
        int to = sc.nextInt();
        System.out.println(convertCC(num,to));
    }
}
