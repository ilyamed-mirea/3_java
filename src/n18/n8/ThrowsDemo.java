package n18.n8;

import java.util.Objects;
import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.nextLine();
        try {
            printDetails(key);
        } catch (Exception e) {
            System.out.println("An error occurred. try again");
            System.out.println(e.getMessage());
            getKey();
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
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