package n9.n3;

public class TesterMerge {
    public static void merge(
            Student[] a, Student[] l, Student[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].idNumber <= r[j].idNumber) {
                a[k++] = l[i++];
            }
            else {
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

    public static void mergeSort(Student[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void mergeSortStart(Student[] a,Student[] b, int an, int bn) {
        Student[] c = new Student[an+bn];
        mergeSort(a,an);
        mergeSort(b,bn);
        merge(c,a,b,an,bn);
        mergeSort(c,an+bn);
        for (int i=0;i<c.length;i++) {
            System.out.println(c[i].idNumber);
        }
    }

        public static void main(String[] args) {
            Student[] students = new Student[5];
            students[0] = new Student(155);
            students[1] = new Student(22);
            students[2] = new Student(375);
            students[3] = new Student(4);
            students[4] = new Student(532);
            Student[] students2 = new Student[5];
            students2[0] = new Student(63);
            students2[1] = new Student(752);
            students2[2] = new Student(8);
            students2[3] = new Student(965);
            students2[4] = new Student(10);

            mergeSortStart(students,students2,5,5);
        }

}
