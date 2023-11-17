package hwSeminar05.service;

import hwSeminar05.model.Student;
import hwSeminar05.model.StudentGroup;
import hwSeminar05.model.Teacher;
import hwSeminar05.model.WorkGroup;
import hwSeminar05.repository.StudentRepository;
import hwSeminar05.repository.UserRepository;

import javax.management.openmbean.CompositeData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WorkGroupService {

    public List<WorkGroup> workGroupList(Teacher teacher, List<Student> studentsList){
        return workGroupList(teacher,studentsList);
    }

    public static List<WorkGroup> getAll() {
        return null;
    }
}