package behavioral.mediator;

public interface Mediator {
  void sellShares(int number, String shareCode, final int colleagueCode);
  void buyShares(int number, String shareCode, final int colleagueCode);
  void addColleague(Colleague colleague);
}
