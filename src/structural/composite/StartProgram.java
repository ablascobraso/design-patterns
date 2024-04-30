package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class StartProgram {

  public static void main (String... args){
    List<TodoProject> compraTodo = new ArrayList<>();
    SingleTodoLeaf comprarTomaquets = new SingleTodoLeaf("Comprar tomaquets");
    SingleTodoLeaf comprarCeba = new SingleTodoLeaf("Comprar ceba");
    compraTodo.add(comprarTomaquets);
    compraTodo.add(comprarCeba);
    CompositeTodo compra = new CompositeTodo("Fer la compra", compraTodo);

    List<TodoProject> rentarRobaTodo = new ArrayList<>();
    SingleTodoLeaf rentarGayumbos = new SingleTodoLeaf("Rentar gayumbos");
    SingleTodoLeaf rentarMitjons = new SingleTodoLeaf("Rentar mitjons");
    SingleTodoLeaf rentarCamisa = new SingleTodoLeaf("Rentar camisa");

    rentarRobaTodo.add(rentarGayumbos);
    rentarRobaTodo.add(rentarMitjons);
    rentarRobaTodo.add(rentarCamisa);
    CompositeTodo roba = new CompositeTodo("Rentar la roba", rentarRobaTodo);

    List<TodoProject> totTodo = new ArrayList<>();
    totTodo.add(compra);
    totTodo.add(roba);
    CompositeTodo tot = new CompositeTodo("Tot el que has de fer", totTodo);

    System.out.println(tot.getHtml());
  }
}
