package hwSeminar05;

// — Создать класс УчебнаяГруппа, содержащий в себе поля Преподаватель и список Студентов;
// — Создать класс УчебнаяГруппаСервис, в котором реализована функция (входные параметры - (Teacher,
//   List<Strudent>)) формирования из Студентов и Преподавателя УчебнойГруппы и возвращения его;
// — Создать метод в Контроллере, в котором агрегируются функции получения списка студентов (их id)
//   и преподавателя (его id) и формирования учебной группы, путём вызова метода из сервиса;
// — Всё вышеуказанное создать согласно принципам ООП, пройдённым на семинаре.

import hwSeminar05.controller.StudentController;
import hwSeminar05.controller.TeacherController;
import hwSeminar05.repository.StudentRepository;
import hwSeminar05.repository.TeacherRepository;
import hwSeminar05.service.StudentService;
import hwSeminar05.service.TeacherService;
import hwSeminar05.view.SortType;
import hwSeminar05.view.StudentView;
import hwSeminar05.view.TeacherView;

public class Main {
    public static void main(String[] args) {
        StudentView view = getStudentView();
        TeacherView view2 = getTeacherView();

//----------------------------------------------------------------------
        view.create("Ivan Morozov", 18, "02");
        view.create("Petr Vorobev", 19, "03");
        view.create("Sidor Sidorov", 20, "112");
        view.create("Elena Ivanova", 19, "911");
        view.create("Anna Morozova", 17, "01");
//----------------------------------------------------------------------
        view2.create("Petr Hlebov", 54, "4456");
//----------------------------------------------------------------------
        view.sendOnConsole(SortType.AGE);

//----------------------------------------------------------------------
        view2.sendOnConsole(SortType.AGE);
    }

    private static TeacherView getTeacherView() {
        TeacherRepository repository = new TeacherRepository();
        TeacherService service = new TeacherService(repository);
        TeacherController controller = new TeacherController(service);
        return new TeacherView(controller);
    }

    private static StudentView getStudentView() {
        StudentRepository repository = new StudentRepository();
        StudentService service = new StudentService(repository);
        StudentController controller = new StudentController(service);
        return new StudentView(controller);
    }
}