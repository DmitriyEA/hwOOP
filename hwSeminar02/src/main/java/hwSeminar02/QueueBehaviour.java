package hwSeminar02;

public interface QueueBehaviour {
    void takeInQueue(Human actor);

    Human releaseFromQueue();
}