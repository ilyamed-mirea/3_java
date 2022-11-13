package n11.n3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Student implements Comparable<Student> {
        public String name;
        public String family;
        public String specify;
        public int groupid;
        public int course;
        public String sortBy = "groupId";
        public Date birthDate;


    public Student(String name, String family, String specify, int groupid, int course, String sortBy, Date birthDate) {
        this.name = name;
        this.family = family;
        this.specify = specify;
        this.groupid = groupid;
        this.course = course;
        this.sortBy = sortBy;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getSpecify() {
        return specify;
    }

    public void setSpecify(String specify) {
        this.specify = specify;
    }

    public int getGroupid() {
        return groupid;
    }

    public void setGroupid(int groupid) {
        this.groupid = groupid;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public String getBirthDate(String format) {
        if (Objects.equals(format, "short")) {
            return new SimpleDateFormat("dd.MM.yyyy").format(birthDate);
        } else if (Objects.equals(format, "long")) {
            return new SimpleDateFormat("E, yyyy.MM.dd 'at' hh:mm:ss a zzz").format(birthDate);
        }
        else {
            return new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(birthDate);
        }
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public int compareTo(Student o) {
        if (Objects.equals(this.sortBy, "groupId"))
            return this.groupid-o.groupid;
        else if (Objects.equals(this.sortBy, "course"))
            return this.course-o.course;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", specify='" + specify + '\'' +
                ", groupid=" + groupid +
                ", course=" + course +
                ", sortBy='" + sortBy + '\'' +
                ", birthDate=" + getBirthDate("long") +
                '}';
    }
}
