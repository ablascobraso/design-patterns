package behavioral.templatemethod;

public abstract class AbstractPastaDish {

  public void cookPastaDish(){
    boilWater();
    addPasta();
    addSauce();
    addProtein();
  }

  private void boilWater() {
    System.out.println("Boiling water..");
  }

  abstract void addPasta();
  abstract void addSauce();
  abstract void addProtein();
}
