import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class test1 {
   public static void main(String[] args) throws FileNotFoundException {
//      ArrayList<Character> left = new ArrayList<>();
//      left.add('(');
//      left.add('{');
//      left.add('[');
//      ArrayList<Character> right = new ArrayList<>();
//      right.add(')');
//      right.add('}');
//      right.add(']');
//
//      char[] string = {'(', '{', '}'};
//      System.out.println();
//      for (char cha : string) {
//         System.out.println(left.contains(cha));
//      }
//      System.out.println((int) '{' + " = " + (int) '}');
//      System.out.println((int) '[' + " = " + (int) ']');
//      System.out.println((int) '(' + " = " + (int) ')');
      String url = new Scanner(new File("/Users/royalfiish/IdeaProjects/UdemyAppium/src/test/java/CloudTesting/url")).nextLine();
      System.out.println(url);

   }
}
