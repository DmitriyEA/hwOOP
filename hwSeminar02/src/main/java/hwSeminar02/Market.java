package hwSeminar02;

import java.util.*;

public class Market implements QueueBehaviour, MarketBehaviour {
    /** посетители */
    private ArrayList<Human> visitors;
    private List<Actor> orders;

    /** очередь посетителей */
    private Queue<Human> queueOrders;

    public Market() {
        visitors = new ArrayList<Human>();
        queueOrders = new ArrayDeque<>();
    }

    /** занятие очереди */
    @Override
    public void takeInQueue(Human actor) {
        if (visitors.contains(actor)){
            this.queueOrders.add(actor);
            actor.setMakeOrder(true);
            System.out.println("У посетителя " + actor.getName() + " принят заказ");
        }
    }

    /** выход из очереди */
    @Override
    public Human releaseFromQueue() {
        if (queueOrders.peek()!= null) {
            Human human = queueOrders.poll();
            human.setTakeOrder(true);
            long timeOrder = new Date().getTime() - human.getCreatedOrder().getTime();
            System.out.println("Заказ выдан " + human.getName() + " через " + timeOrder/1000 + " секунд");
            return human;
        }
        return null;
    }

    /** посещение магазина
     * @param actor объект человек, пришедший
     */
    @Override
    public void acceptToMarket(Human actor) {
        this.visitors.add(actor);
        System.out.println("Посетитель "+ actor.getName() + " зашел в магазин");
    }

    /** выход из магазина */
    @Override
    public void releaseFromMarket(Human actor) {
        this.visitors.remove(actor);
        System.out.println("Посетитель "+ actor.getName() + " ушел из магазина");
    }

    /** обновление статуса в магазине */
    @Override
    public void update() {
        if (visitors != null && visitors.size() > 0){
            System.out.println("-".repeat(20));
            System.out.println("В магазине " + visitors.size() + " посетителей");
            System.out.println("В работе " + queueOrders.size() + " заказ(ов)");
        }
        else {
            System.out.println("Магазин пуст");
        }
    }
}