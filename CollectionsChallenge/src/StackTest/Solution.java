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

   private static boolean checkBalance(String string) {
      Stack<Integer> stack = new Stack<>();
      Map<Integer, Integer> map = new HashMap<>();
      map.put(123, 125);
      map.put(91, 93);
      map.put(40, 41);
      boolean flag = true;
      if (string.length() % 2 != 0) {
         return false;
      }
      char[] chars = string.toCharArray();
      for (char cha : chars) {
         if (stack.isEmpty()) {
            if (!map.keySet().contains((int) cha)) {
               flag = false;
            } else {
               stack.add((int) cha);
            }
         } else {
            if (map.keySet().contains((int) cha)) {
               stack.add((int) cha);
            } else {
               int currentChar = stack.pop();

               if (map.get(currentChar) != (int) cha) {
                  flag = false;
               }
            }
         }
      }
      return flag;
   }

}


