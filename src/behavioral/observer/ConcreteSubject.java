package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject{

  List<Observer> observers = new ArrayList<>();
  String content;

  @Override
  public void addObserver(final Observer observer) {
    System.out.println("Observer was added: " + observers.add(observer));
  }

  @Override
  public void deleteObserver(final Observer observer) {
    System.out.println("Observer was removed: " + observers.remove(observer));
  }

  @Override
  public void update() {
    observers.forEach(Observer::update);
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
    System.out.println("Content was updated...");
    update();
  }
}
