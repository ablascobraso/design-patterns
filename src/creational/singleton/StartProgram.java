package creational.singleton;

public class StartProgram {

  public static void main (String[] args){
    final Singleton instance = Singleton.getInstance();
    System.out.println(instance);
  }
}
