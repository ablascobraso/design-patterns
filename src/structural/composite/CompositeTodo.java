package structural.composite;

import java.util.List;

public class CompositeTodo implements TodoProject {

  List<TodoProject> todoProjects;
  String title;

  public CompositeTodo(String title, List<TodoProject> todoProjects) {
    this.todoProjects = todoProjects;
    this.title = title;
  }

  @Override
  public String getHtml() {
    String composition = "<h1> ".concat(title + " </h1>\n<ul>\n");
    for (TodoProject todoProject : todoProjects){
      composition = "<li> "+composition.concat(todoProject.getHtml())+" </li>\n";
    }
    return composition+"\n</ul>";
  }
}
