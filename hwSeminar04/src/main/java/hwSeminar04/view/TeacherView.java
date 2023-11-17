package hwSeminar04.view;

import hwSeminar04.data.Teacher;

import java.util.List;

public class TeacherView implements UserView<Teacher>{

    @Override
    public void sendOnConsole(List<Teacher> teachers) {
        for(Teacher teacher: teachers){
            System.out.println(teacher.toString());
        }
    }

    public void sendOnConsoleTeachers(Teacher teacher){
        System.out.println(teacher.toString());
    }

}