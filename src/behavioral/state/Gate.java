package behavioral.state;

public class Gate {

  GateState currentGateState;

  Gate() {
    currentGateState = new ClosedGateState(this);
  }

  void changeState(GateState newGateState) {
    currentGateState = newGateState;
  }

  void enter(){
    currentGateState.enter();
  }

  void paidOk(){
    currentGateState.paidOk();
  }

  void paidFail(){
    currentGateState.paidFail();
  }

}
