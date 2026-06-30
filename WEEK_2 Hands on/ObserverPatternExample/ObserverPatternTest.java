public class ObserverPatternTest {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobileUser = new MobileApp("Alice");
        Observer webUser = new WebApp("Bob");

        // Register observers
        stockMarket.registerObserver(mobileUser);
        stockMarket.registerObserver(webUser);

        // Update stock price
        stockMarket.setStock("TCS", 3650.75);

        // Deregister one observer
        stockMarket.deregisterObserver(webUser);

        // Update again
        stockMarket.setStock("Infosys", 1525.50);
    }
}