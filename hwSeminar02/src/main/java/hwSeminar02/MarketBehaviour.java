package hwSeminar02;

import java.util.List;

public interface MarketBehaviour {
    void acceptToMarket(Human actor);
    void releaseFromMarket(Human actor);
    void update();
}