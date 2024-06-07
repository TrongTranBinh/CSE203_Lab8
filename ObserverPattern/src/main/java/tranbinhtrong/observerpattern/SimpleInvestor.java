package tranbinhtrong.observerpattern;

public class SimpleInvestor implements Investor {

    private String name;
    private Strategy currentStrategy;

    public SimpleInvestor(String name) {
        this.name = name;
        this.currentStrategy = Strategy.MonitorOnly;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Strategy adaptStrategy() {
        return currentStrategy;
    }

    @Override
    public void update(String stockSymbol, double priceChange) {
        System.out.print(getName() + " was notified about the price change in " + stockSymbol + ": $" + priceChange);
        if (priceChange < 50) {
            System.out.print(" and change their strategy to " + Strategy.HedgingStrategies + "\n");
        } else {
            if (priceChange > 200) {
                System.out.print(" and change their strategy to " + Strategy.QuickTransaction + "\n");
            } else {
                System.out.print(" and do nothing about the change of price\n");
            }
        }
    }

}
