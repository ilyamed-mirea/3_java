package n4.part1.n7;

public class Testtt {
    public static void printStudents(Learner[] a) {
        System.out.println("Students:");
        for (Learner learner : a) {
            if (learner instanceof Student) {
                learner.print();
            }
        }
    }

    public static void printSchools(Learner[] a) {
        System.out.println("Schools:");
        for (Learner learner : a) {
            if (learner instanceof School) {
                learner.print();
            }
        }
    }

    public static void main(String[] args) {
        Learner[] a = new Learner[3];
        a[0] = new School();
        a[1] = new Student();
        a[2] = new School();

        printStudents(a);
        System.out.println();
        printSchools(a);
    }
}
