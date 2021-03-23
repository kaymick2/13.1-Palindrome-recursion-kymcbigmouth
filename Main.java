import java.util.*;

class Main {
  public static void main(String[] args) {
    brainded ded = new brainded();
    Scanner input = new Scanner(System.in);
    Scanner isQuit=new Scanner(System.in);
    String quitIs;
    do{
    System.out.println("enter word here: ");
    String word = input.nextLine();
    if (ded.isPalindrome(word) == true) {
      System.out.println("That was a palindrome!");
    } else {
      System.out.println("That wasn't a palindrome");
    }
    System.out.println("would you like to try again? enter \"q\" to quit:");
    quitIs=isQuit.next();
    }while(!"q".equals(quitIs));
  }

}