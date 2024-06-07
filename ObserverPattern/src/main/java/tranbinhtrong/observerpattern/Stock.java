
package tranbinhtrong.observerpattern;

public interface Stock {
    public void addObserver(Investor investor);
    public void removeObeserver(Investor investor);
    public void notifyInvestors(double priceChange);
}
