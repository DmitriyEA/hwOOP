package hwSeminar04.view;

import hwSeminar04.data.User;

import java.util.List;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}