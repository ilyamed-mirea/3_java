package n3.Format.n3;

import java.util.Scanner;

public class Report {
    private static final boolean testMode = true;
    private static Scanner sc = new Scanner(System.in);
    private static final int empCount = 4;
    private static Employee[] employees = new Employee[empCount];

    private static void getEmployees() {
        if (testMode) {
            employees[0] = new Employee("AAAAAA", 3245.34);
            employees[1] = new Employee("BBBBBBBB", 4353.4);
            employees[2] = new Employee("CCCC", 324554.34);
            employees[3] = new Employee("DDDDDDD DD DD", 412);
            return;
        }
        for (int i = 0; i < empCount; i++) {
            System.out.println(i + 1 + " employee:\n");
            System.out.println("write fullname:");
            String fullname = sc.nextLine();
            System.out.println("write salary:");
            double salary = sc.nextDouble();
            String nextLine = sc.nextLine();
            employees[i] = new Employee(fullname, salary);
        }
    }

    public static void generateReport() {
        for (int i = 0; i < empCount; i++) {
            System.out.printf("%-25s %25.2f %15s %n", employees[i].getFullname(), employees[i].getSalary(), Math.random()>0.3?"Approved":"Not Approved");
        }
    }

    public static void main(String[] args) {
        getEmployees();
        generateReport();
    }
}
