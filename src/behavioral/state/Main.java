package behavioral.state;

public class Main {

  public static void main (String ... args){
    Gate gate = new Gate();
    System.out.println(" --> The user goes to the train and he just bought a ticket..");
    gate.enter();
    gate.paidFail();
    gate.paidOk();
    gate.enter();

    System.out.println(" --> The previous user just went in, the door is now closed again..");

    gate.enter();
  }
}
