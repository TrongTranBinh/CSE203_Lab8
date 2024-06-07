package tranbinhtrong.observerpattern;

interface Investor {

    String getName();

    Strategy adaptStrategy();

    void update(String stockSymbol, double priceChange);
}
