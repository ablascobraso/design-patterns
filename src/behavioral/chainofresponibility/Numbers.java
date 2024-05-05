package behavioral.chainofresponibility;


public class Numbers {
  private int number1;
  private int number2;
  private String request;

  Numbers(final int number1, final int number2, final String request) {
    this.number1 = number1;
    this.number2 = number2;
    this.request = request;
  }

  int getNumber1() {
    return number1;
  }

  void setNumber1(final int number1) {
    this.number1 = number1;
  }

  int getNumber2() {
    return number2;
  }

  void setNumber2(final int number2) {
    this.number2 = number2;
  }

  String getRequest() {
    return request;
  }

  void setRequest(final String request) {
    this.request = request;
  }
}
