package hwSeminar05.service;

import hwSeminar05.model.User;

import java.util.Comparator;

public class UserComparator<T extends User> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        String familyName1 = o1.getFullName().split("\\s+")[1];    //.split("\\s+") где //s+ универсальный разделитель
        String familyName2 = o2.getFullName().split("\\s+")[1];    // при сплите получаем массив и сохраняем 2 элемент
        return familyName1.compareTo(familyName2);
    }
}