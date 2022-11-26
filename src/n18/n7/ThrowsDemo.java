package n18.n7;

import java.util.Objects;
import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.nextLine();
        printDetails(key);
    }

    public void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            System.out.println("An error occurred");
            System.out.println(e.getMessage());
        }
    }

    private String getDetails(String key) throws Exception {
        if (Objects.equals(key, "")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo obj = new ThrowsDemo();
        obj.getKey();
    }
}