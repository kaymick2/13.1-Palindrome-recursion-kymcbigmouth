public class brainded {
  private static String word;

  public static boolean isPalindrome(String word) {
    int length = word.length();
    char first = word.charAt(0);
    char last = word.charAt(length - 1);
    if ((length <= 1) || (word == null)) { 
      return true;
    }else if (length==2 && first==last){
      return true;
    }
    if (first == last) {
      word = word.substring(1, length - 1);
      return isPalindrome(word);
    } else {
      return false;
    }
  }
}