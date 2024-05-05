package behavioral.templatemethod;

public class SpaghettiMeatballs extends AbstractPastaDish{
  @Override
  void addPasta() {
    System.out.println("Add spaghetti..");
  }

  @Override
  void addSauce() {
    System.out.println("Add bologna's sauce..");
  }

  @Override
  void addProtein() {
    System.out.println("Add meet balls..");
  }
}
