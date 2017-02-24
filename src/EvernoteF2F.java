import java.util.*;

public enum EvernoteF2F {
   ACTIVE, INACTIVE, PENDING;

   public static void main(String[] args) {
      System.out.println(EvernoteF2F.ACTIVE);

      System.out.println(prevPalidrome(113));
      int[] arr = {1, 2, 4, 3, 4, 2, 65};
      HashSet<Integer> set = new HashSet<>();

      for (int integer : arr) {
         set.add(integer);
      }
      Iterator<Integer> iterator = set.iterator();


      while (iterator.hasNext()) {

      }
   }

   public static boolean prevPalidrome(int x) {

      boolean ifPalindrome = true;

      String intToString = String.valueOf(x);
      if (intToString.length() < 2) {
         return ifPalindrome;
      }
      for (int i = 0; i < intToString.length(); i++) {
         Stack<Character> stack = new Stack<>();
         Queue<Character> queue = new LinkedList<>();


         stack.push(intToString.charAt(i));
         queue.add(intToString.charAt(i));

         if (stack.peek() != queue.peek()) {
            ifPalindrome = false;
         }
      }

      return ifPalindrome;

   }
}
