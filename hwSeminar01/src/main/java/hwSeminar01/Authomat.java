package hwSeminar01;

import java.util.List;

public interface Authomat<T>{

    void initProducts (List<T> newList);

    void printProduct();

    void addProduct(T hotDrink);
}
