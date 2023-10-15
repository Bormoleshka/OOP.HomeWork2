import java.util.List;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.name = "Alexey";
        human.setMakeOrder();
        human.setTakeOrder();
        human.isMakeOrder();
        System.out.println(human.isMakeOrder());
        human.isTakeOrder();
        System.out.println(human.isTakeOrder());
        
        Market market = new Market();
        market.acceptToMarket(human);
        market.takeQueue(human);
        market.giveOrder();
        market.takeOrder();
        market.releaseFromQueue();
        market.releaseFromMarket((List<Actor>) human);
        market.update();
    }
}
