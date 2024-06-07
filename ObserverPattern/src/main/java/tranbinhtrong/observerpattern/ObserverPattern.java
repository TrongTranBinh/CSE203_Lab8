package tranbinhtrong.observerpattern;

public class ObserverPattern {

    public static void main(String[] args) {
        // Create stocks
        Stock apple = new ConcreteStock("APP", 200);
        Stock samsung = new ConcreteStock("SAM", 200);
        Stock cristianoStock = new ConcreteStock("CR7", 100);
        
        // Register basic investor
        Investor cr7 = new SimpleInvestor("Cristiano Ronaldo");
        Investor m10 = new SimpleInvestor("Lionel Messi");
        Investor mp3 = new SimpleInvestor("Kylian Mbappe");
        samsung.addObserver(cr7);
        apple.addObserver(m10);
        cristianoStock.addObserver(cr7);
        cristianoStock.addObserver(mp3);
       
        // Price Change and notify
        samsung.notifyInvestors(250);
        apple.notifyInvestors(40);
        cristianoStock.notifyInvestors(120);
    }
}
