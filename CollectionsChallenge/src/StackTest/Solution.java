package StackTest;

import java.util.*;

class Solution {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      while (sc.hasNext()) {
         String input = sc.next();
         //Complete the code
         System.out.println(checkBalance(input));
      }

   }

   public static boolean checkBalance(String string) {
      Stack<Integer> stack = new Stack<>();
      Map<Integer, Integer> map = new HashMap<>();
      map.put(123, 125);
      map.put(91, 93);
      map.put(40, 41);
      boolean flag = true;
      if (string.length() % 2 != 0) {
         flag = false;
         return flag;
      }
      char[] chars = string.toCharArray();
      for (char cha : chars) {

      }


      return flag;
   }
}


