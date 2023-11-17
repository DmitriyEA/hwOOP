package hwSeminar02;

// Реализовать класс Market и все методы, которые он обязан реализовывать. Методы из интерфейса QueueBehaviour,
// имитируют работу очереди, MarketBehaviour – помещает и удаляет человека из очереди, метод update – обновляет
// состояние магазина (принимает и отдаёт заказы)

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Human visitor1 = new Human("Иван");
        Human visitor2 = new Human("Петр");
        Human visitor3 = new Human("Анна");

        Market market = new Market();
        market.update();

        market.acceptToMarket(visitor1);
        market.acceptToMarket(visitor2);
        market.acceptToMarket(visitor3);
        market.takeInQueue(visitor2);
        market.update();
        market.takeInQueue(visitor3);

        market.releaseFromMarket(visitor1);
        Thread.sleep(1000);

        market.releaseFromMarket(market.releaseFromQueue());
        market.update();

    }

}