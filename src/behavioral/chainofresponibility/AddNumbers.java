package behavioral.chainofresponibility;

public class AddNumbers implements Chain {

  Chain nextChain;

  @Override
  public void doCalculation(final Numbers numbersRequest) {

    if(numbersRequest.getRequest().equals("add")){
      System.out.println("Number 1: "+ numbersRequest.getNumber1()+" + "
          +"Number 2: "+ numbersRequest.getNumber2()+ " = "
          +(numbersRequest.getNumber1() + numbersRequest.getNumber2()));
    }
    else{
      nextChain.doCalculation(numbersRequest);
    }
  }

  public void setNextChain(final Chain nextChain) {
    this.nextChain = nextChain;
  }

}
