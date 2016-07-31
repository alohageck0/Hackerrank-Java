package InterviewQuestions;

import org.testng.annotations.Test;

import java.util.*;

public class Count {

   @Test
   public void test() {
//      System.out.println(countChars("abdsskjjfffjfjjjd"));
      System.out.println(countChars("abbabbaacccc"));
//      System.out.println(countChars("abdsskjjfffjfjjjd"));
      int[][] arr = {{0, 1, 0, 1, 0}, {0, 1, 0, 0, 0}, {0, 0, 0, 1, 0}};
      System.out.println(ifSquare(arr));
      int[] arr1 = null;
      highestProduct(arr1);
   }

   public Character countChars(String input) {
      if (input == null || input.length() == 0) {
         return null;
      }
      Map<Character, Integer> map = new LinkedHashMap<>();
      for (int i = 0; i < input.length(); i++) {
         if (!map.containsKey(input.charAt(i))) {
            map.put(input.charAt(i), 1);
         } else {
            map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
         }
      }
      char result = ' ';
      int max = 0;
      for (Character c : map.keySet()) {
         if (map.get(c) > max) {
            result = c;
            max = map.get(c);
         }
      }
      return result;
   }

   public boolean ifSquare(int[][] array) {
      if (array == null) {
         return false;
      }
      int max = 0;
      if (array.length < array[0].length) {
         max = array.length;
      } else {
         max = array[0].length;
      }
      if (max < 2) {
         return false;
      }
      for (int i = 0; i < array.length - max; i++) {
         for (int j = 0; j < array[i].length - max; j++) {
            if (array[i][j] == 0) {
               continue;
            } else {
               for (int side = 1; side <= max; side++) {
                  if (array[i + side][j] == 1 && array[i + side][j + side] == 1 && array[i][j + side] == 1) {
                     return true;
                  }
               }
            }
         }
      }
      return false;
   }

   public void highestProduct(int[] array) {
      if (array == null) {
         System.out.println("Array is null");
      } else {
         int result;
         if (array.length < 3) {
            System.out.println("Array too small");
         } else if (array.length == 3) {
            result = array[0];
            for (int i = 1; i < array.length; i++) {
               result *= array[i];
               System.out.println(result);
            }
         } else {
            Arrays.sort(array);
            int resultWithNegatives = array[0] * array[1] * array[array.length - 1];
            int resultOnlyPositives = array[array.length - 1] * array[array.length - 2] * array[array.length - 3];
            result = Integer.max(resultOnlyPositives, resultWithNegatives);
            System.out.println(result);
         }
      }
   }
}
