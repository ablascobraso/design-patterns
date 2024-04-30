package structural.composite;

public class SingleTodoLeaf implements TodoProject {

  private final String text;

  public SingleTodoLeaf(final String text) {
    this.text = text;
  }


  @Override
  public String getHtml() {
    return text;
  }
}
