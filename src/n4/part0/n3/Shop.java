package n4.part0.n3;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    private static Scanner sc = new Scanner(System.in);
    private static String[] usersList = new String[]{"miha_qwerty", "nik_pass1", "admin_password", "semen_redrose"};
    private static boolean isAuth = false;
    private static ArrayList<Item> cart = new ArrayList<>();

    private static void auth() {
        System.out.println("write login");
        String login = sc.nextLine();
        System.out.println("write password");
        String password = sc.nextLine();
        String data = login + "_" + password;
        for (String user : usersList)
            if (user.equals(data)) {
                System.out.println("Welcome.");
                isAuth = true;
                break;
            }
        if (!isAuth)
            System.out.println("Wrong password or login.");
    }

    public static void main(String[] args) {
        while (!isAuth)
            auth();
        int menu = -1;
        while (menu != 0) {
            System.out.println("1) check catalogs");
            System.out.println("2) check items in catalog");
            System.out.println("3) put item in cart");
            System.out.println("4) buy items from cart");
            System.out.println("5) print cart");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    showCatalogs();
                    break;
                case 2:
                    showCatalog();
                    break;
                case 3:
                    addToCard();
                    break;
                case 4:
                    buyFromCard();
                    break;
                case 5:
                    printCart();
                    break;
            }
        }
    }

    private static void printCart() {
        if (cart.size()==0)
            System.out.println("Cart is empty");
        for (Item item : cart) {
            System.out.println(item.toString());
        }
    }

    private static void buyFromCard() {
        System.out.println();
        for (Item item : cart) {
            System.out.println("Buy "+item);
        }
        cart.clear();
        System.out.println("Done\n Cart is empty now\n");
    }

    private static void addToCard() {
        String productName = sc.next();

        var x = getEnum(Drinks.class, productName);
        if (x != null) {
            System.out.println(x.toString() + " now in cart");
            cart.add(x);
            return;
        }
        var y = getEnum(Fitness.class, productName);
        if (y != null) {
            System.out.println(y.toString() + " now in cart");
            cart.add(y);
            return;
        }
        var z = getEnum(Tech.class, productName);
        if (z != null) {
            System.out.println(z.toString() + " now in cart");
            cart.add(z);
            return;
        }
        System.out.println("Not found :(");
    }

    private static <T extends Enum> T getEnum(Class<T> catalogClass, String name) {
        for (T i : catalogClass.getEnumConstants()) {
            if (i.toString().equals(name)) {
                return i;
            }
        }
        return null;
    }

    private static <T extends Enum> void printCatalog(Class<T> catalogClass) {
        System.out.println("\nItems in catalog " + catalogClass.toString());
        for (T i : catalogClass.getEnumConstants()) {
            System.out.println(i.toString());
        }
        System.out.println();
    }

    private static void showCatalog() {
        System.out.println("write catalog name");
        String name = sc.next();
        Catalogs choosen = Enum.valueOf(Catalogs.class, name);
        switch (choosen) {
            case Drinks:
                printCatalog(Drinks.class);
                break;
            case Fitness:
                printCatalog(Fitness.class);
                break;
            case Tech:
                printCatalog(Tech.class);
                break;
            default:
                System.out.println("error");
                return;
        }
    }

    private static void showCatalogs() {
        System.out.println("Catalogs:");
        for (Catalogs cat : Catalogs.values()) {
            System.out.println(cat.toString());
        }
        System.out.println();
    }
}
