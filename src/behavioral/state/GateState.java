package behavioral.state;

public interface GateState {
  void enter();

  void paidOk();

  void paidFail();
}
