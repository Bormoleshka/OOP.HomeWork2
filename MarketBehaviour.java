import java.util.List;

public interface MarketBehaviour {
    void acceptToMarket(Human human);

    void releaseFromMarket(List<Actor> humans);



    void update();
}