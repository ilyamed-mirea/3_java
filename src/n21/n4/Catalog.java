package n21.n4;

import java.util.ArrayList;

public class Catalog {
    private static ArrayList catalog;

    public static void print() {
        for (int i = 0; i < catalog.size(); i++) {
            System.out.println(catalog.get(i));
        }
    }

    public static <T> T getCatalogElement(T[] catalog, int i) {
        return (T) catalog[i];
    }

    public static <T> ArrayList<T> toArrayList(T[] catalog) {
        ArrayList<T> list = new ArrayList<>();
        for (T t : catalog) {
            list.add(t);
        }
        return list;
    }

    public static void main(String[] args) {
        Object[] oCatalog = new Object[]{"Hello", "World", "Test"};
        catalog = toArrayList(oCatalog);
        print();
    }
}
