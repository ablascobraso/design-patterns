package behavioral.mediator;

public class AlexTheBroker extends Colleague{

  AlexTheBroker(Mediator mediator) {
    super(mediator);
    System.out.println("Alex just signed up for the exchange");
  }
}
