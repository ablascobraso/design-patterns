package behavioral.templatemethod;

public class Main {

  public static void main(String ... args){
    System.out.println("Cook Alfredo pasta");
    PenneAlfredo penneAlfredo = new PenneAlfredo();
    penneAlfredo.cookPastaDish();
    System.out.println("Cook Spagheti meatbals");
    SpaghettiMeatballs spaghettiMeatballs = new SpaghettiMeatballs();
    spaghettiMeatballs.cookPastaDish();
  }
}
