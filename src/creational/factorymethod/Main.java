package creational.factorymethod;

public class Main {
  public static void main (String[] args){

    ExpensiveKnifeStore expensiveKnifeStore = new ExpensiveKnifeStore();
    final Knife expensiveKnife = expensiveKnifeStore.orderKnife("expensive");

    BudgetKnifeStore budgetKnifeStore = new BudgetKnifeStore();
    final Knife cheapKnife = budgetKnifeStore.orderKnife("budget");

    System.out.println(expensiveKnife.toString());
    System.out.println(cheapKnife.toString());
    //They will be creating specific knives in each store, but at the same time calling sharpen and clean from
    //its super class KnifeStore. So that we leave the subclasses decide
  }
}
