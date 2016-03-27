import java.util.ArrayList;

public class test1 {
   public static void main(String[] args) {
      ArrayList<Character> left = new ArrayList<>();
      left.add('(');
      left.add('{');
      left.add('[');
      ArrayList<Character> right = new ArrayList<>();
      right.add(')');
      right.add('}');
      right.add(']');

      char[] string = {'(', '{', '}'};
      System.out.println();
      for (char cha : string) {
         System.out.println(left.contains(cha));
      }
      System.out.println((int) '{' + " = " + (int) '}');
      System.out.println((int) '[' + " = " + (int) ']');
      System.out.println((int) '(' + " = " + (int) ')');


   }
}
