package behavioral.chainofresponibility;

public interface Chain {

  void setNextChain(Chain nextChain);

  void doCalculation(Numbers numbersRequest);
}
