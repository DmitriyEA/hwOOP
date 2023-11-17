package hwSeminar05.model;

import java.util.List;

public class WorkGroup extends User {
    public Teacher teacher;
    public List<Student> studentsList;

    public WorkGroup(Teacher teacher, List<Student> studentsList) {
        super(teacher,studentsList);
    }
}