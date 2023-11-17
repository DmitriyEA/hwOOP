package hwSeminar05.view;

import task5.model.User;

public interface UserView<T extends User> {
    void sendOnConsole(String sortType);    //тип запроса GET

    void create(String fullName, Integer age, String phoneNumber);  //тип запроса POST

    void removeUser(String fullName);   //тип запроса DELETE
}