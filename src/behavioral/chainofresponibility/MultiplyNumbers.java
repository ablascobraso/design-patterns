package behavioral.chainofresponibility;

public class MultiplyNumbers implements Chain {

  @Override
  public void doCalculation(final Numbers numbersRequest) {

    if(numbersRequest.getRequest().equals("multiply")){
      System.out.println("Number 1: "+ numbersRequest.getNumber1()+" * "
          +"Number 2: "+ numbersRequest.getNumber2()+ " = "
          +(numbersRequest.getNumber1() * numbersRequest.getNumber2()));
    }
    else{
      System.out.println("Only works for add, sub and multiply...");
    }
  }

  @Override
  public void setNextChain(final Chain nextChain) {
  }
}
