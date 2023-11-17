package hwSeminar04;

// — Создать класс УчительСервис и реализовать аналогично проделанному на семинаре;
// — Создать класс УчительВью и реализовать аналогично проделанному на семинаре;
// — Создать класс УчительКонтроллер и реализовать возможность создания, редактирования
//   конкретного учителя и отображения списка учителей, имеющихся в системе.

import hwSeminar04.controller.TeacherController;
import hwSeminar04.view.TeacherView;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        TeacherController tc = new TeacherController();
        TeacherView tv = new TeacherView();
        tc.create("Иван", "Иванов", "Иванович", LocalDate.of(2000, 1, 1));
        tc.create("Петр", "Петров", "Петрович", LocalDate.of(2001, 2, 2));
        tc.create("Сидор", "Сидоров", "Сидорович", LocalDate.of(2002, 3, 3));

        tc.updateTeacher(1, "Иван", "Петрович", "Сидоров", LocalDate.of(2000, 1, 1));
        tv.sendOnConsole(tc.getAll());
    }
}