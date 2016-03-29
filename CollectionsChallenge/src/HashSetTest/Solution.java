package HashSetTest;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Pair {
   private String firstPersonName;
   private String secondPersonName;

   Pair(String firstPersonName, String secondPersonName) {
      this.firstPersonName = firstPersonName;
      this.secondPersonName = secondPersonName;
   }

   private String getFirstPersonName() {
      return firstPersonName;
   }

   private String getSecondPersonName() {
      return secondPersonName;
   }

   @Override
   public int hashCode() {
      return this.firstPersonName.hashCode() + this.secondPersonName.hashCode() + 44;
   }

   @Override
   public boolean equals(Object obj) {
      boolean result = false;
      if (obj instanceof Pair) {
         Pair pair = (Pair) obj;
         if (this.firstPersonName.equals(pair.getFirstPersonName())) {
            result = this.secondPersonName.equals(pair.getSecondPersonName());
         }
      }
      return result;
   }
}

public class Solution {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      Set<Pair> set = new HashSet<>();
      scanner.nextLine();
      for (int i = 0; i < n; i++) {
         String s = scanner.nextLine();
         Pair pair = new Pair(s.substring(0, s.indexOf(' ')), s.substring(s.indexOf(' ') + 1));
         set.add(pair);
         System.out.println(set.size());
      }
   }
}
