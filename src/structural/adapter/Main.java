package structural.adapter;

public class Main {
  public static void main (String... args){
    OldCoffeeMachine oldCoffeeMachine = new OldCoffeeMachine();
    CoffeeMachineInterface coffeeTouchscreenAdapter = new CoffeeTouchscreenAdapter(oldCoffeeMachine);
    coffeeTouchscreenAdapter.chooseFirstSelection();
    coffeeTouchscreenAdapter.chooseSecondSelection();
  }
}
