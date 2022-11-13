package n11.n5;

import java.util.ArrayList;
import java.util.LinkedList;

public class Tester {
    static ArrayList<String> arrayList = new ArrayList<>();
    static LinkedList<String> linkedList = new LinkedList<>();
    static int elements = 10000;

    static void checkVstavka() {
        System.out.println("vstavka:");
        long start = System.currentTimeMillis();
        for (int i = 0; i < elements; i++) {
            arrayList.add("a");
        }
        long end = System.currentTimeMillis();
        System.out.printf("arrayList: %d\n", end - start);
        start = System.currentTimeMillis();
        for (int i = 0; i < elements; i++) {
            linkedList.add("a");
        }
        end = System.currentTimeMillis();
        System.out.printf("linkedList: %d\n", end - start);
    }

    static void checkRemove() {
        System.out.println("remove:");
        long start = System.currentTimeMillis();
        for (int i = 0; i < elements; i++) {
            arrayList.remove(0);
        }
        long end = System.currentTimeMillis();
        System.out.printf("arrayList: %d\n", end - start);
        start = System.currentTimeMillis();
        for (int i = 0; i < elements; i++) {
            linkedList.remove(0);
        }
        end = System.currentTimeMillis();
        System.out.printf("linkedList: %d\n", end - start);
    }

    static void checkGet() {
        System.out.println("get:");
        long start = System.currentTimeMillis();
        for (int i = 0; i < elements; i++) {
            arrayList.get(i);
        }
        long end = System.currentTimeMillis();
        System.out.printf("arrayList: %d\n", end - start);
        start = System.currentTimeMillis();
        for (int i = 0; i < elements; i++) {
            linkedList.get(i);
        }
        end = System.currentTimeMillis();
        System.out.printf("linkedList: %d\n", end - start);
    }

    static void checkSearch() {
        System.out.println("search:");
        arrayList.set(elements - 2, "test");
        linkedList.set(elements - 2, "test");
        long start = System.currentTimeMillis();
        for (int i = 0; i < elements; i++) {
            arrayList.contains("test");
        }
        long end = System.currentTimeMillis();
        System.out.printf("arrayList: %d\n", end - start);
        start = System.currentTimeMillis();
        for (int i = 0; i < elements; i++) {
            linkedList.contains("test");
        }
        end = System.currentTimeMillis();
        System.out.printf("linkedList: %d\n", end - start);
    }

    public static void main(String[] args) {
        checkVstavka();
        checkGet();
        checkSearch();
        checkRemove();
    }
}
