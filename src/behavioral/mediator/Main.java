package behavioral.mediator;

public class Main {

  public static void main(String[] args) {
    StockMediator nyse = new StockMediator();
    AlexTheBroker broker = new AlexTheBroker(nyse);
    StefyTheBroker broker2 = new StefyTheBroker(nyse);

		broker.sellShares(100, "MSFT");
		broker.sellShares(50, "GOOG");

		broker2.buyShares(100, "MSFT");
		broker2.sellShares(10, "NRG");

		broker.buyShares(10, "NRG");

		nyse.getStockOfferings();
  }
}
