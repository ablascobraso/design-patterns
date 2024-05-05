package behavioral.state;

public class OpenGateState implements GateState {

  Gate gate;

  public OpenGateState(final Gate gate) {
    this.gate = gate;
  }

  @Override
  public void enter() {
    System.out.println("You just entered the door...");
    gate.changeState(new ClosedGateState(gate));
  }

  @Override
  public void paidOk() {
    System.out.println("You already paid...");
  }

  @Override
  public void paidFail() {
    System.out.println("You already paid...");
  }
}
