package hwSeminar05.service;

import hwSeminar05.model.Student;
import hwSeminar05.model.Teacher;
import hwSeminar05.model.User;
import hwSeminar05.repository.StudentRepository;
import hwSeminar05.repository.UserRepository;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentService implements UserService<Student> {
    private final UserRepository<Student> studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        Long id = studentRepository.getMaxId() + 1;
        Student student = new Student(id, fullName, age, phoneNumber);
        studentRepository.add(student);
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.getAll();
    }

    @Override
    public List<Student> getAllSortUsers() {
        List<Student> students = studentRepository.getAll();
        Collections.sort(students);
        return students;
    }

    @Override
    public List<Student> getAllSortUsersByFamilyName() {
        List<Student> students = studentRepository.getAll();
        students.sort(new UserComparator<>());
        return students;
    }

    @Override
    public List<Student> getAllSortUsersByAge() {
        List<Student> students = studentRepository.getAll();
//        students.sort((o1, o2) -> o1.getAge().compareTo(o2.getAge()));
        students.sort(Comparator.comparing(User::getAge));
        return students;
    }

    @Override
    public void removeUser(String fullName ) {
        studentRepository.remove(fullName);
    }

    @Override
    public List<Student> getAllId() {
        return null;
    }

    @Override
    public void create(Teacher teacher, List<Student> studentsList) {

    }
}