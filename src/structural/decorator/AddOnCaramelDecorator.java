package structural.decorator;

public class AddOnCaramelDecorator extends AddOnDecorator {

  Beverage beverage;

  AddOnCaramelDecorator(final Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public double getBeveragePrice() {
    return this.beverage.getBeveragePrice() + 1;
  }
}
