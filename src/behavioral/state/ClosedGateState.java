package behavioral.state;

public class ClosedGateState implements GateState {

  Gate gate;

  ClosedGateState(Gate gate) {
    this.gate = gate;
  }

  @Override
  public void enter() {
    System.out.println("You cannot enter the door is closed..");
  }

  @Override
  public void paidOk() {
    System.out.println("Paid OK..");
    gate.changeState(new OpenGateState(gate));
  }

  @Override
  public void paidFail() {
    System.out.println("Paid Fail..");
  }
}
