package n10;

import n9.n2.SortingStudentsByGPA;

import java.util.ArrayList;

public class TesterPRO {
    public ArrayList<Student> iDNumber = new ArrayList<>();

    //fill array
    public void setArray() {
        iDNumber.add(new Student("John", "Doe", "IT", 123, 3));
        iDNumber.add(new Student("Max", "Doe", "IT", 21, 2));
        iDNumber.add(new Student("Seo", "Fet", "IT", 7, 4));
        iDNumber.add(new Student("ASh", "sssss", "IT", 17, 42));
    }

    public void outArray() {
        for (int i = 0; i < iDNumber.size(); i++) {
            System.out.println(iDNumber.get(i).getName() + " " + iDNumber.get(i).getFamily() + " " + iDNumber.get(i).getSpecify() + " " + iDNumber.get(i).getGroupid() + " " + iDNumber.get(i).getCourse());
        }
    }

    public static void quickSort(ArrayList<Student> list, int first, int last) {
        if (first < last) {
            int pivotIndex = partition(list, first, last);
            quickSort(list, first, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, last);
        }
    }

    public static int partition(ArrayList<Student> list, int first, int last) {
        Student pivot = list.get(first);
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
                Student temp = list.get(high);
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

    static public TesterPRO merge(ArrayList<Student> test1, ArrayList<Student> test2) {
        //merge two arrays into one
        TesterPRO res = new TesterPRO();
        res.iDNumber.addAll(test1);
        res.iDNumber.addAll(test2);
        return res;
    }

    static public void setSortBy(TesterPRO list) {
        System.out.println("Sort by: ");
        System.out.println("1: groupId");
        System.out.println("2: course");
        int gotSort;
        gotSort = new java.util.Scanner(System.in).nextInt();
        list.iDNumber.forEach((student) -> {
            student.sortBy = gotSort == 1 ? "groupId" : "course";
        });
    }

    public static void main(String[] args) {
        TesterPRO test1 = new TesterPRO();
        TesterPRO test2 = new TesterPRO();
        test1.setArray();
        test2.setArray();
        TesterPRO test3 = merge(test1.iDNumber, test2.iDNumber);
        setSortBy(test3);
        quickSort(test3.iDNumber, 0, test3.iDNumber.size() - 1);
        test3.outArray();
    }

}
