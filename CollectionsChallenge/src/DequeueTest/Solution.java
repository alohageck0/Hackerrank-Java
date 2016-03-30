package DequeueTest;

import java.util.*;

public class Solution {
   public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      int n = scanner.nextInt();
      int subarrayLength = scanner.nextInt();
      Deque<Integer> deque = new ArrayDeque<>();
      int maxNumberUniqueInt = 0;

      for (int i = 0; i < n; i++) {
         deque.add(scanner.nextInt());
      }

      while (deque.size() >= subarrayLength) {
         Set<Integer> set = new HashSet<>();
         Iterator<Integer> iterator = deque.iterator();
         for (int i = 0; i < subarrayLength; i++) {
            set.add(iterator.next());
         }
         deque.removeFirst();
         if (set.size() > maxNumberUniqueInt) {
            maxNumberUniqueInt = set.size();
         }
      }
      System.out.println(maxNumberUniqueInt);
   }
}
