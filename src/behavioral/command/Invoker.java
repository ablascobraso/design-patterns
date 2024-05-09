package behavioral.command;

public class Invoker {

  ICommand pasteCommand;

  Invoker(final ICommand pasteCommand) {
    this.pasteCommand = pasteCommand;
  }

  void controlUve(){
    pasteCommand.execute();
  }

  void controlZeta(){
    pasteCommand.unExecute();
  }
}
