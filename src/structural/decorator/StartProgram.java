package structural.decorator;

public class StartProgram {

  public static void main (String... args){
    AddOnCaramelDecorator addOnCaramel = new AddOnCaramelDecorator(new BlackCoffee());
    AddOnCoconutMilkDecorator addOnCoconutMilk = new AddOnCoconutMilkDecorator(new BlackCoffee());

    System.out.println("Cost of adding caramel and coffee: " + addOnCaramel.getBeveragePrice());
    System.out.println("Cost of adding coconut milk and coffee: " + addOnCoconutMilk.getBeveragePrice());
  }
}
