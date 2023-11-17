package hwSeminar01;

/** Класс для горячих напитков
 *  Наследует свойства класса @Product
 */

public class HotDrink extends Product{

    private int volumeSize;
    private int temperature;

    /** Конструктор класса для горячих напитков
     *  Наследует свойства класса @Product
     *  @param name название напитка
     *  @param cost стоимость
     *  @param volumeSize объем напитка
     *  @param temperature температура напитка
     */

    public HotDrink(String name, int cost, int volumeSize, int temperature){
        super(name, cost);
        this.volumeSize = volumeSize;
        this.temperature = temperature;
    }

    public int getVolumeSize() {
        return volumeSize;
    }

    public void setVolumeSize(int volumeSize) {
        this.volumeSize = volumeSize;
    }

    public String getName() {
        return super.getName();
    }

    @Override
    public String getInfoProduct() {
        return "Напиток " + name +
                " объем = " + volumeSize +
                " стоимость = " + cost +
                " температура = " + temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
