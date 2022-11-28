package n19.n1;

import java.util.Scanner;

public class INN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your fio: ");
        String fio = scanner.next();
        System.out.print("Enter your INN: ");
        String inn = scanner.next();
        try {
            if (inn.length() == 10) {
                int[] innArray = new int[inn.length()];
                for (int i = 0; i < inn.length(); i++) {
                    innArray[i] = Integer.parseInt(String.valueOf(inn.charAt(i)));
                }
                int sum = 0;
                for (int i = 0; i < innArray.length - 1; i++) {
                    sum += innArray[i] * (innArray.length - i);
                }
                int controlNumber = sum % 11;
                if (controlNumber == 10)
                    controlNumber = 0;
                if (controlNumber == innArray[innArray.length - 1]) {
                    System.out.println("INN is correct"); //1212121247
                } else {
                    throw new IllegalArgumentException("INN is incorrect");
                }
            } else {
                throw new IllegalArgumentException("INN must be 10 digits");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("try again");
            main(args);
        }
    }
}
