package hwSeminar01;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingAutomat implements Authomat<HotDrink> {

    private List<HotDrink> hotDrinkList = new ArrayList<>();

    public HotDrinkVendingAutomat() {

    }

    /** Инициализация торгового автомата
     * @param newListProduct список первоначальных напитков
     */

    @Override
    public void initProducts(List<HotDrink> newListProduct) {
        this.hotDrinkList = newListProduct;
    }

    /** Вывод названия продуктов загруженных в торговый автомат*/
    @Override
    public void printProduct() {
        if (hotDrinkList.isEmpty()){
            System.out.println("Автомат пуст");
        }
        else{
            System.out.println("В аппарате находятся:");
            for (HotDrink drink:
                    hotDrinkList) {
                System.out.println(drink.getName());
            }
        }
    }

    /** Поиск продукта по заданным параметрам
     * @param name название напитка
     */
    public void getProduct(String name) {
        System.out.println("--");
        for (HotDrink drink:
                hotDrinkList) {
            if (drink.getName().equalsIgnoreCase(name)){
                System.out.println(drink.getInfoProduct());
            }
        }
    }

    /** Поиск продукта по заданным параметрам
     * @param cost стоимость
     */
    public void getProduct(int cost){
        System.out.println("--");
        for (HotDrink drink:
                hotDrinkList) {
            if (drink.getCost() == cost){
                System.out.println(drink.getInfoProduct());
            }
        }
    }

    /** Поиск продукта по заданным параметрам
     * @param name название напитка
     * @param cost стоимость
     * @param volume объем напитка
     * @param temperature температура напитка
     */
    public void getProduct(String name, int cost, int volume, int temperature){
        System.out.println("--");
        for (HotDrink drink:
                hotDrinkList) {
            if (drink.getCost() == cost &&
                    drink.getName().equalsIgnoreCase(name) &&
                    drink.getVolumeSize()== volume &&
                    drink.getTemperature() == temperature){
                System.out.println(drink.getInfoProduct());
            }
        }
    }

    @Override
    public void addProduct(HotDrink hotDrink) {
        this.hotDrinkList.add(hotDrink);
    }
}