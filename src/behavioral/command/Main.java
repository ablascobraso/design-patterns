package behavioral.command;

public class Main {

  public static void main(String... args){
    Invoker invoker = new Invoker(new CommandPaste(new Document(), "Hello"));
    invoker.controlUve();
    invoker.controlZeta();
    invoker.controlZeta();
    invoker.controlUve();
    invoker.controlUve();
  }
}
