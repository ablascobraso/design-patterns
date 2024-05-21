package behavioral.observer;

public class Main {

  public static void main (String... args){
    ConcreteSubject subject = new ConcreteSubject();
    ConcreteObserver observer = new ConcreteObserver(subject);
    subject.addObserver(observer);
    subject.setContent("New fresh content here..");
    observer.displayLastContent();
    subject.deleteObserver(observer);
  }
}
