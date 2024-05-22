import java.util.*;
public class Main {
  public static void main(String[] args) {
    ArrayList <String> words = new ArrayList<String>();
    words.add("catch");
    words.add("bobcat");
    words.add("catchacat");
    words.add("cat");
    words.add("at");
    wordChecker list = new wordChecker(words);
    System.out.println(list.createList("cat"));
  }
}
