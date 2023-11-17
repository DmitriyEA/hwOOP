package hwSeminar01;

// 1. Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
// 2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный
// метод getProduct(int name, int volume, int temperature), выдающий продукт соответствующий имени, объёму
// и температуре
// 3. В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику,
// заложенную в программе
// 4. Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HotDrink> hotDrinkList = new ArrayList<>();
        HotDrinkVendingAutomat hotDrinkVendingAutomat = new HotDrinkVendingAutomat();
        HotDrink latte = new HotDrink("Латте", 160, 240, 80);
        hotDrinkList.add(latte);
        HotDrink coffee = new HotDrink("Кофе Классик", 120, 120, 80);
        hotDrinkList.add(coffee);
        hotDrinkVendingAutomat.printProduct();

        hotDrinkVendingAutomat.initProducts(hotDrinkList);
        hotDrinkVendingAutomat.printProduct();
        System.out.println();

        HotDrink teaBlack = new HotDrink("Чай черный", 80, 240, 75);
        hotDrinkVendingAutomat.addProduct(teaBlack);
        hotDrinkVendingAutomat.printProduct();
        System.out.println();

        hotDrinkVendingAutomat.getProduct(100);
        hotDrinkVendingAutomat.getProduct("Латте");
        hotDrinkVendingAutomat.getProduct("Кофе Классик", 120, 120,80);


    }
}
