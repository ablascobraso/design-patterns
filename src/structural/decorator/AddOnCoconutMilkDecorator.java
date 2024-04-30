package structural.decorator;

public class AddOnCoconutMilkDecorator extends AddOnDecorator {

  Beverage beverage;

  AddOnCoconutMilkDecorator(final Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public double getBeveragePrice() {
    return this.beverage.getBeveragePrice() + 0.5;
  }
}
