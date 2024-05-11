package behavioral.mediator;

import java.util.ArrayList;
import java.util.Objects;

public class StockMediator implements Mediator{

  private ArrayList<Colleague> colleagues;
  private ArrayList<StockOffer> stockBuyOffers;
  private ArrayList<StockOffer> stockSaleOffers;

  private int colleagueCodes = 0;

  public StockMediator(){
    colleagues = new ArrayList<>();
    stockBuyOffers = new ArrayList<>();
    stockSaleOffers = new ArrayList<>();
  }



  @Override
  public void sellShares(final int numberOfShares, final String shareCode, final int colleagueCode) {
    boolean stockSold = false;
    for(StockOffer offer: stockBuyOffers){
      if((Objects.equals(offer.getStockSymbol(), shareCode)) && (offer.getNumberOfStockShares() == numberOfShares)){
        System.out.println(numberOfShares + " shares of " + shareCode +
            " sold to colleague code " + offer.getColleagueCode());
        stockBuyOffers.remove(offer);
        stockSold = true;
      }
      if(stockSold){ break; }
    }
    if(!stockSold) {
      System.out.println(numberOfShares + " shares of " + shareCode +
          " added to inventory");
      StockOffer newOffering = new StockOffer(numberOfShares, shareCode, colleagueCode);
      stockSaleOffers.add(newOffering);
    }
  }

  @Override
  public void buyShares(final int numberOfShares, final String shareCode, final int colleagueCode) {
    boolean stockBought = false;
    for(StockOffer offer: stockBuyOffers){
      if((Objects.equals(offer.getStockSymbol(), shareCode)) && (offer.getNumberOfStockShares() == numberOfShares)){
        System.out.println(numberOfShares + " shares of " + shareCode +
            " sold to colleague code " + offer.getColleagueCode());
        stockBuyOffers.remove(offer);
        stockBought = true;
      }
      if(stockBought){ break; }
    }
    if(!stockBought) {
      System.out.println(numberOfShares + " shares of " + shareCode +
          " added to inventory");
      StockOffer newOffering = new StockOffer(numberOfShares, shareCode, colleagueCode);
      stockBuyOffers.add(newOffering);
    }
  }

  @Override
  public void addColleague(final Colleague newColleague) {
    colleagues.add(newColleague);
    colleagueCodes++;
    newColleague.setColleagueCode(colleagueCodes);
  }


  public void getStockOfferings(){

    System.out.println("\nStocks for Sale");

    for(StockOffer offer: stockSaleOffers){
      System.out.println(offer.getNumberOfStockShares() + " of " + offer.getStockSymbol());
    }

    System.out.println("\nStock Buy Offers");

    for(StockOffer offer: stockBuyOffers){
      System.out.println(offer.getNumberOfStockShares() + " of " + offer.getStockSymbol());
    }
  }
}
