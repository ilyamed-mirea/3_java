package n9.n1;

public class Student implements Comparable<Student>{
    public int idNumber;

    public Student(int idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public int compareTo(Student o) {
        return this.idNumber-o.idNumber;
    }
}
