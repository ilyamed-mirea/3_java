package n10;

import java.util.Objects;

public class Student implements Comparable<Student> {

        public String name;
        public String family;
        public String specify;
        public int groupid;
        public int course;
        public String sortBy = "groupId";
    public Student(String name, String family, String specify, int groupid, int course) {
        this.name = name;
        this.family = family;
        this.specify = specify;
        this.groupid = groupid;
        this.course = course;
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

    @Override
    public int compareTo(Student o) {
        if (Objects.equals(this.sortBy, "groupId"))
            return this.groupid-o.groupid;
        else if (Objects.equals(this.sortBy, "course"))
            return this.course-o.course;
        else
            return 0;
    }
}
