package creational.factorymethod;

public abstract class KnifeStore {

  Knife orderKnife(String knifeType){
    Knife knife = createKnife(knifeType);
    knife.sharpenKnife();
    knife.cleanKnife();
    return knife;
  }

  abstract Knife createKnife(final String knifeType);
}
