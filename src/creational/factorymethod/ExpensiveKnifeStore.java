package creational.factorymethod;

public class ExpensiveKnifeStore extends KnifeStore{

  @Override
  Knife createKnife(final String knifeType) {
    if (knifeType.equals("expensive")){
      return new ExpensiveKnife();
    }
    return null;
  }
}
