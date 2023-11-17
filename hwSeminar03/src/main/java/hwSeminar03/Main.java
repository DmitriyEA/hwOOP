package hwSeminar03;

// - Модифицировать класс УчебнаяГруппаСервис, добавив в него метод сортировки списка студентов по имени
// - Модифицировать класс Контроллер, добавив в него метод сортировки списка студентов по имени и вызывать
//   в нем созданный метод из УчебнаяГруппаСервис
// - Создать класс СтудентКомпаратор реализующий интерфейс Comparator
// - Реализовать контракт compare () со сравнением по фамилии
// - Модифицировать класс УчебнаяГруппаСервис, добавив в него метод сортировки списка студентов по фамилии
// - Модифицировать класс Контроллер, добавив в него метод сортировки списка студентов по фамилии и вызывать
//   в нем созданный метод из УчебнаяГруппаСервис

public class Main {
    public static void main(String[] args) {
        StudentGroup group = new StudentGroup();
        StudentRepository repository = new StudentRepository(group);
        StudentGroupService service = new StudentGroupService(repository);
        StudentController controller = new StudentController(service);

        System.out.println("\nСписок без сортировки:");
        controller.addStudent(new Student(4L, "Иван Иванов"));
        controller.addStudent(new Student(6L, "Петр Петров"));
        controller.addStudent(new Student(2L, "Сидр Сидоров"));
        controller.addStudent(new Student(1L, "Василий Васильев"));
        controller.printAll();

        System.out.println("\nСортировка по имени:");
        controller.sortByFirstName();
        controller.printAll();

        System.out.println("\nСортировка по фамилии:");
        controller.sortByLastName();
        controller.printAll();

    }
}