package n19.n2;

import java.util.ArrayList;


public class Tester {
    static ArrayList<SortingStudentsByGPA> students = new ArrayList<>();

    //write method that quicksort students by gpa using compare to
    public static void quickSort(ArrayList<SortingStudentsByGPA> list, int first, int last) {
        if (first < last) {
            int pivotIndex = partition(list, first, last);
            quickSort(list, first, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, last);
        }
    }

    public static int partition(ArrayList<SortingStudentsByGPA> list, int first, int last) {
        SortingStudentsByGPA pivot = list.get(first);
        int low = first + 1;
        int high = last;

        while (high > low) {
            while (low <= high && list.get(low).compareTo(pivot) <= 0) {
                low++;
            }

            while (low <= high && list.get(high).compareTo(pivot) > 0) {
                high--;
            }

            if (high > low) {
                SortingStudentsByGPA temp = list.get(high);
                list.set(high, list.get(low));
                list.set(low, temp);
            }
        }

        while (high > first && list.get(high).compareTo(pivot) >= 0) {
            high--;
        }

        if (pivot.compareTo(list.get(high)) > 0) {
            list.set(first, list.get(high));
            list.set(high, pivot);
            return high;
        } else {
            return first;
        }
    }

    public static void main(String[] args) {
        students.add(new SortingStudentsByGPA(324));
        students.add(new SortingStudentsByGPA(133));
        students.add(new SortingStudentsByGPA(287));

        try {
            quickSort(students, 0, students.size() - 1);
        }
        catch (Exception e) {
            System.out.println("catch error");
            System.out.println(e);
        }
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).gpa);
        }
    }
}
