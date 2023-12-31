package hwSeminar05.service;

import hwSeminar05.model.Student;
import hwSeminar05.model.Teacher;
import hwSeminar05.model.User;

import java.util.List;

public interface UserService<T extends User> {
    void create(String fullName, Integer age, String phoneNumber);

    List<T> getAll();

    List<T> getAllSortUsers();

    List<T> getAllSortUsersByFamilyName();

    List<T> getAllSortUsersByAge();

    void removeUser(String fullName);

    List<T> getAllId();

    void create(Teacher teacher, List<Student> studentsList);
}