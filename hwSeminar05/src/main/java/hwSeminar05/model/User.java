package hwSeminar05.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class User {
    private  Long id;
    private  String fullName;
    private  Integer age;
    private  String phoneNumber;

    public User(Teacher teacher, List<Student> studentsList) {
    }
}