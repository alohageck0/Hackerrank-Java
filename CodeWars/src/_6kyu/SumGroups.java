package _6kyu;


import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

class Solution {
   //todo think how do without -1
   public static int sumGroups(int[] arr) {
      int length = arr.length;
      if (length == 1) {
         return 1;
      }
      boolean ifNoConsecutives = false;
      while (!ifNoConsecutives) {
         ifNoConsecutives = true;
         for (int i = 0; i < arr.length; i++) {
            int currentInt = arr[i]; //4
            if (currentInt < 0) {
               continue;
            }
            int j = i;
            if (j < arr.length - 1) {
               int nextInt = arr[j + 1]; //2
               while (j + 2 < arr.length - 1) {
                  if (nextInt >= 0) {
                     break;
                  } else {
                     nextInt = arr[j + 2];
                     j++;
                  }
               }
               while (currentInt % 2 == nextInt % 2) {
                  arr[i] += nextInt;
                  ifNoConsecutives = false;
                  arr[j + 1] = -1;
                  j++;
                  try {
                     while (true) {
                        nextInt = arr[j + 1];
                        if (nextInt >= 0) {
                           break;
                        } else {
                           j++;
                        }
                     }
                  } catch (Exception e) {
                     break;
                  }
               }
            }

            System.out.println(Arrays.toString(arr));
         }
      }
      for (int anArr : arr) {
         if (anArr < 0) {
            length--;
         }
      }
      return length;
   }
}

public class SumGroups {
   @Test
   public void basicTests() {
      assertEquals(6, Solution.sumGroups(new int[]{2, 1, 2, 2, 6, 5, 0, 2, 0, 5, 5, 7, 7, 4, 3, 3, 9}));
      assertEquals(5, Solution.sumGroups(new int[]{2, 1, 2, 2, 6, 5, 0, 2, 0, 3, 3, 3, 9, 2}));
      assertEquals(1, Solution.sumGroups(new int[]{2}));
      assertEquals(2, Solution.sumGroups(new int[]{1, 2}));
      assertEquals(1, Solution.sumGroups(new int[]{1, 1, 2, 2}));
   }
}
