package hwSeminar02;

public interface ActorBehavior {
    /** создание заказа*/
    void setMakeOrder(boolean isMakeOrder);
    void setTakeOrder(boolean is);
    boolean isMakeOrder();
    boolean isTakeOrder();
}