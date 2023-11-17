package hwSeminar02;

public abstract class Actor implements ActorBehavior {
    /** имя посетителя*/
    protected String name;
    /**Создание заказа*/
    protected boolean isMakeOrder;
    /**Выдача заказа*/
    protected boolean isTakeOrder;

    public Actor(String name){
        this.name = name;
        isMakeOrder = false;
        isTakeOrder = false;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    public void setMakeOrder(boolean makeOrder) {
        isMakeOrder = makeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    public void setTakeOrder(boolean takeOrder) {
        isTakeOrder = takeOrder;
    }
}
