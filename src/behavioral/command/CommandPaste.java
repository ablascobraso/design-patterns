package behavioral.command;

public class CommandPaste implements ICommand{

  private final Document document;
  private final String text;

  CommandPaste(final Document document, final String text) {
    this.document = document;
    this.text = text;
  }

  @Override
  public void execute() {
    document.insertText(text);
  }

  @Override
  public void unExecute() {
    document.deleteText(text.length());
  }
}
