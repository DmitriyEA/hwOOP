package hwSeminar03;

public class Student implements Comparable<Student> {

    private Long id;
    private String fullName;

    public Student(long l, String иванИванов) {
    }

    @Override
    public int compareTo(Student o) {
        return fullName.compareTo(o.fullName);
    }
}