package behavioral.command;

public class Document {

  private int position;


  void insertText(final String text) {
    System.out.println("You just wrote: "+ text);
    updatePosition(text.length(), true);
  }

  void deleteText(final int length) {
    System.out.println("You just deleted the previous text");
    updatePosition(length, false);
  }

  private void updatePosition(int textSize, boolean isInsert){
    if (isInsert){
      position+=textSize;
    }
    else{
      if(position - textSize < 0){
        System.out.println("You have no more text to delete");
        position = 0;
      }
      else{
        position-=textSize;
      }
    }
    System.out.println("Your cursor is in position: "+position);
  }
}
