import java.util.*;

public enum EvernoteF2F {
   ACTIVE, INACTIVE, PENDING;

   public static void main(String[] args) {
//      System.out.println(EvernoteF2F.ACTIVE);

      System.out.println(prevPalindrome(500));
      int[] arr = {1, 2, 4, 3, 4, 2, 65};
      HashSet<Integer> set = new HashSet<>();

      for (int integer : arr) {
         set.add(integer);
      }
      Iterator<Integer> iterator = set.iterator();


   }

   public static int prevPalindrome(int x) {
      int testIfPalindrom = x - 1;
      if (ifPalindrome(testIfPalindrom)) {
         return testIfPalindrom;
      } else {
         return prevPalindrome(testIfPalindrom);
      }
   }

   private static boolean ifPalindrome(int x) {
      boolean ifPalindrome = true;
      String intToString = String.valueOf(x);
      if (intToString.length() < 2) {
         return ifPalindrome;
      }
      Stack<Character> stack = new Stack<>();
      Queue<Character> queue = new LinkedList<>();
      for (int i = 0; i < intToString.length(); i++) {
         stack.push(intToString.charAt(i));
         queue.add(intToString.charAt(i));
      }
      int counter = 1;
      while (!stack.empty()) {
         if (stack.pop() != queue.remove()) {
            ifPalindrome = false;
            break;
         }
         if (counter > stack.size() / 2) {
            break;
         }
      }
      return ifPalindrome;
   }
}
