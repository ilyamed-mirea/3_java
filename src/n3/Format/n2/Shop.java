package n3.Format.n2;

import java.util.Objects;
import java.util.Scanner;

public class Shop {
    private static boolean testMode = true;
    private static Scanner sc = new Scanner(System.in);
    private static int itemsAmount = 2;
    private static Item[] items = new Item[itemsAmount];

    private static void addItems() {
        if (testMode) {
            items[0] = new Item("Cola", 13, 13.1, 12.9, 60 * 13);
            items[1] = new Item("Fanta", 52, 12, 12.2, 60 * 12.1);
            return;
        }
        for (int i = 0; i < itemsAmount; i++) {
            System.out.println("item " + (i + 1) + ": \n");
            System.out.println("write item name(String):");
            String name = sc.nextLine();
            System.out.println("write item amount(int):");
            int amount = sc.nextInt();
            System.out.println("write item eurPrice:");
            double eurPrice = sc.nextDouble();
            System.out.println("write item usdPrice:");
            double usdPrice = sc.nextDouble();
            System.out.println("write item rubPrice:");
            double rubPrice = sc.nextDouble();
            items[i] = new Item(name, amount, eurPrice, usdPrice, rubPrice);
        }
    }

    private static void printItems() {
        for (int i = 0; i < itemsAmount; i++)
            System.out.println(items[i]);
    }

    private static void buyProduct() {
        Item choosenItem = null;
        int choosenCurrency = 0;
        int choosenAmount = 0;
        while (choosenItem == null) {
            System.out.println("Write product name:\n");
            String gotName = sc.nextLine();
            for (int i = 0; i < itemsAmount; i++) {
                if (Objects.equals(gotName, items[i].getName())) {
                    choosenItem = items[i];
                    break;
                }
            }
        }
        while (choosenCurrency<1 || choosenCurrency>3) {
            System.out.println("which currency you want to pay with? write EUR(1) / USD(2) / RUB(3)");
            choosenCurrency = sc.nextInt();
        }
        double itemPriceInCurr = 0;
        String choosenCurrencyName = "";
        switch (choosenCurrency) {
            case 2:
                itemPriceInCurr = choosenItem.getUsdPrice();
                choosenCurrencyName = "USD";
                break;
            case 1:
                itemPriceInCurr = choosenItem.getEurPrice();
                choosenCurrencyName = "EUR";
                break;
            case 3:
                itemPriceInCurr = choosenItem.getRubPrice();
                choosenCurrencyName = "RUB";
                break;
        }
        System.out.println("How much money you have?");
        double userMoneyAmount = sc.nextDouble();
        System.out.println("How many products you want to buy?");
        choosenAmount = sc.nextInt();

        if (userMoneyAmount<(itemPriceInCurr*choosenAmount))
            System.out.println("Your money amount isnt enough :(");
        else if (choosenAmount>(choosenItem.getAmount()))
            System.out.println("Not enough products in shop :(");
        else {
            choosenItem.setAmount(choosenItem.getAmount()-choosenAmount);
            System.out.printf("Success! Now you have %d \"%s\" and you have %f %s left",choosenAmount,choosenItem.getName(),userMoneyAmount-itemPriceInCurr*choosenAmount, choosenCurrency);
        }
    }

    public static void main(String[] args) {
        addItems();
        System.out.println("What you want to buy?\n");
        printItems();

        buyProduct();
    }
}
