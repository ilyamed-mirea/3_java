package n3.Format.n1;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how much 2 currency cost?"); //1 рубль = 63.45 доллара => 63.45
        double price = sc.nextDouble();
        System.out.println("write 1 currency amount"); //180 рублей
        double amount = sc.nextDouble();
        double res = amount/price;
        System.out.printf("res:\n%.3f",res);
    }
}
