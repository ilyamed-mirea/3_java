package n9.n3;

import n10.Student;
import n10.TesterPRO;

import java.util.ArrayList;

public class T
{
    static public TesterPRO mergeSort2(TesterPRO list) {
        if (list.iDNumber.size() <= 1) {
            return list;
        }
        TesterPRO left = new TesterPRO();
        TesterPRO right = new TesterPRO();
        int middle = (list.iDNumber.size() + 1) / 2;
        for (int i = 0; i < middle; i++) {
            left.iDNumber.add(list.iDNumber.get(i));
        }
        for (int i = middle; i < list.iDNumber.size(); i++) {
            right.iDNumber.add(list.iDNumber.get(i));
        }
        left = mergeSort2(left);
        right = mergeSort2(right);
        return merge(left.iDNumber, right.iDNumber);
    }

    private static TesterPRO merge(ArrayList<Student> iDNumber, ArrayList<Student> iDNumber1) {
        return null;
    }

    public static TesterPRO mergeSort(ArrayList<n10.Student> a, int n) {
        if (n < 2) {
            return null;
        }
        int mid = n / 2;
        ArrayList<n10.Student> l = new ArrayList<>(mid);
        ArrayList<n10.Student> r = new ArrayList<>(n - mid);

        for (int i = 0; i < mid; i++) {
            l.add(a.get(i));
        }
        for (int i = mid; i < n; i++) {
            r.add(a.get(i));
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        return merge(l, r);
    }

    public static void merge(
            n10.Student[] a, n10.Student[] l, Student[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].compareTo(r[j]) <= 0) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}
