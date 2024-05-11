package behavioral.mediator;

public class StockOffer {

  private int stockShares = 0;
  private String stockSymbol = "";
  private int colleagueCode = 0;


  StockOffer(final int stockShares, final String stockSymbol, final int colleagueCode) {
    this.stockShares = stockShares;
    this.stockSymbol = stockSymbol;
    this.colleagueCode = colleagueCode;
  }

  int getNumberOfStockShares() {
    return stockShares;
  }

  String getStockSymbol() {
    return stockSymbol;
  }

  int getColleagueCode() {
    return colleagueCode;
  }
}
