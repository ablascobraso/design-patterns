package behavioral.templatemethod;

public class PenneAlfredo extends AbstractPastaDish{
  @Override
  void addPasta() {
    System.out.println("Add penne..");
  }

  @Override
  void addSauce() {
    System.out.println("Add alfredo sauce..");
  }

  @Override
  void addProtein() {
    System.out.println("Add salmon..");
  }
}