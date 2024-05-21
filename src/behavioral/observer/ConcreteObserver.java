package behavioral.observer;

public class ConcreteObserver implements Observer{

  ConcreteSubject subject;
  String content;


  public ConcreteObserver(ConcreteSubject subject) {
    this.subject = subject;
  }

  @Override
  public void update() {
    System.out.println("Observer getting last content..");
    content = subject.getContent();
  }

  public void displayLastContent(){
    System.out.println("Last content: " + content);
  }
}
