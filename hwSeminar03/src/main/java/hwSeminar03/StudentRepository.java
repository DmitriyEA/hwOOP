package hwSeminar03;

public class StudentRepository {
    private StudentGroup studentGroup;

    public StudentRepository(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public void addStudent(Student student){
        studentGroup.addStudent(student);
    }
}