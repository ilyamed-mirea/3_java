package n9.n1;

import java.util.ArrayList;

public class Tester {

    static ArrayList<Student> students = new ArrayList<>();

    public static void selectionSort (ArrayList<Student> list) {
        int min;
        Student temp;
        for (int index = 0; index < list.size() - 1; index++) {
            min = index;
            for (int scan = index + 1; scan < list.size(); scan++)
                if (list.get(scan).compareTo(list.get(min)) < 0) {
                    min = scan;
                    temp = list.get(min);
                    list.set(min, list.get(index));
                    list.set(index, temp);
                }
        }
    }

    public static void main(String[] args) {
        students.add(new Student(134));
        students.add(new Student(311));
        students.add(new Student(54));

        selectionSort(students);

        for (int i=0;i<students.size();i++) {
            System.out.println(students.get(i).idNumber);
        }
    }
}
