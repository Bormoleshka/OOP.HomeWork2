public interface QueueBehaviour {
    void takeQueue(Actor actor);

    void takeQueue(Human human);

    void takeOrder();
    void giveOrder();
    void releaseFromQueue();
}