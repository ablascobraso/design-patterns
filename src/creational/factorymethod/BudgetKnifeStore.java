package creational.factorymethod;

public class BudgetKnifeStore extends KnifeStore{

  @Override
  Knife createKnife(final String knifeType) {

    if (knifeType.equals("cheap")){
      return new CheapKnife();
    }
    else if (knifeType.equals("budget")){
      return new BudgetKnife();
    }
    return null;
  }
}
