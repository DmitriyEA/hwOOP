package hwSeminar05.controller;

import hwSeminar05.model.Student;
import hwSeminar05.model.Teacher;
import hwSeminar05.model.User;

import java.util.List;

public interface UserController<T extends User> {
    void create(Teacher teacher, List<Student> studentsList);

    void create(String fullName, Integer age, String phoneNumber);

    List<T> getAllSortUsers();

    List<T> getAllSortUsersByFamilyName();

    boolean removeUser(String fullName);

    List<T> getAll();

    List<T> getAllSortUsersByAge();

}