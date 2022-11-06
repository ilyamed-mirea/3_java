package n4.part1.n9;

import java.util.Scanner;

public class FurnitureShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Choose: chair / table");
            String choosenType = sc.nextLine();
            System.out.println("Which color? ");
            String choosenColor = sc.nextLine();
            if (choosenType.equals("table")) {
                Furniture table = new Table(choosenColor);
                System.out.println(table);
            } else {
                Furniture chair = new Chair(choosenColor);
                System.out.println(chair);
            }
        }
    }
}
