package n2;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

interface ShopI {
    public String findComputer(String compName);
    public void addComputer(String compName);
    public void deleteComputer(String compName);
}

public class Shop implements ShopI{
    private ArrayList<String> computers = new ArrayList<String>();

    public String findComputer(String compName) {
        for (int i=0;i<computers.size();i++)
            if (Objects.equals(computers.get(i), compName))
                return Integer.toString(i);
        return "error";
    }

    public void addComputer(String compName) {
        computers.add(compName);
    }

    public void deleteComputer(String compName) {
        String index = findComputer(compName);
        computers.remove(index);
    }

    public void print() {
        for(int i=0;i<computers.size();i++)
            System.out.println(computers.get(i));
    }
}

class Test {
    public static void main(String[] args) {
        Shop shop = new Shop();
        System.out.println("Сколько компьютеров хотите добавить?");
        Scanner sc = new Scanner(System.in);
        int colv = sc.nextInt();
        for (int i=0;i<=colv;i++) {
            System.out.println("Введите название компьютера:");
            String compName = sc.nextLine();
            shop.addComputer(compName);
        }
        sc.close();
        shop.print();
        System.out.println(shop.findComputer("IBM"));
    }
}