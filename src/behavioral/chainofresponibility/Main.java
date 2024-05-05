package behavioral.chainofresponibility;

public class Main {
  public static void main(String ... args){
    Chain addNumbers = new AddNumbers();
    Chain subNumbers = new SubNumbers();
    Chain multiplyNumbers = new MultiplyNumbers();

    addNumbers.setNextChain(subNumbers);
    subNumbers.setNextChain(multiplyNumbers);

    Numbers numbersToAdd = new Numbers(3, 3, "add");
    addNumbers.doCalculation(numbersToAdd);

    Numbers numbersToSub = new Numbers(3, 3, "sub");
    addNumbers.doCalculation(numbersToSub);

    Numbers numbersToMultiply = new Numbers(3, 3, "multiply");
    addNumbers.doCalculation(numbersToMultiply);

    Numbers numbersToDivide = new Numbers(3, 3, "divide");
    addNumbers.doCalculation(numbersToDivide);
  }
}
