package tranbinhtrong.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteStock implements Stock {

    private String symbol;
    private double currentPrice;
    private List<Investor> list = new ArrayList<>();

    public ConcreteStock(String symbol, double currentPrice) {
        this.symbol = symbol;
        this.currentPrice = currentPrice;
    }

    @Override
    public void addObserver(Investor investor) {
        this.list.add(investor);
    }

    @Override
    public void removeObeserver(Investor investor) {
        this.list.remove(investor);
    }

    @Override
    public void notifyInvestors(double priceChange) {
        currentPrice = priceChange;
        for (Investor e : list ) {
            e.update(symbol, priceChange);
        }
    }

}
