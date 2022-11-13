package n9.n2;

public class SortingStudentsByGPA implements Comparable<SortingStudentsByGPA>{

    public int gpa;

    public SortingStudentsByGPA(int gpa) {
        this.gpa = gpa;
    }

    @Override
    public int compareTo(SortingStudentsByGPA o) {
        return this.gpa-o.gpa;
    }
}
