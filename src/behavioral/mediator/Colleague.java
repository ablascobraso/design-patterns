package behavioral.mediator;

public abstract class Colleague {

  private final Mediator mediator;
  private int colleagueCode;

  Colleague(final Mediator mediator) {
    this.mediator = mediator;
  }


  void buyShares(int number, String shareCode){
    mediator.buyShares(number, shareCode, colleagueCode);
  }
  void sellShares(int number, String shareCode){
    mediator.sellShares(number, shareCode, colleagueCode);
  }
  void setColleagueCode(int collCode){ colleagueCode = collCode; }
}
