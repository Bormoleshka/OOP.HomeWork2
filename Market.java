import java.util.*;

public class Market implements QueueBehaviour, MarketBehaviour {
    List<Actor> actors = new LinkedList<>();
    Queue<Actor> actorsQueue;

    public Market() {
        actorsQueue = new ArrayQueue();
    }


    @Override
    public void acceptToMarket(Human human) {
        Actor actor = null;
        System.out.println(ActorBehavior.getName() + " зашел в магазин");
        actors.add(null);
        {


        }




    }

    @Override
    public void releaseFromMarket(List<Actor> actor) {
        actors.remove(actor);
        System.out.println(ActorBehavior.getName() + " покинул магазин");

    }

    @Override
    public void update() {

    }

    @Override
    public void takeQueue(Actor actor) {

    }

    @Override
    public void takeQueue(Human human) {
        Actor actor = null;
        actorsQueue.add(null);
        System.out.println(ActorBehavior.getName() + " встал в очередь");

    }

    @Override
    public void takeOrder() {

        actorsQueue.peek().isTakeOrder();
        System.out.println(ActorBehavior.getName() + " забрал заказ");

    }

    @Override
    public void giveOrder() {
        actorsQueue.peek().isMakeOrder();
        System.out.println(ActorBehavior.getName() + " сделал заказ");

    }

    @Override
    public void releaseFromQueue() {
        System.out.println(ActorBehavior.getName() + " покинул очередь");
        actorsQueue.poll();

    }


}
