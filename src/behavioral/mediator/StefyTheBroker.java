package behavioral.mediator;

public class StefyTheBroker extends Colleague{

  Mediator mediator;

  StefyTheBroker(Mediator mediator) {
    super(mediator);
    System.out.println("Stefy just signed up for the exchange");
  }
}
