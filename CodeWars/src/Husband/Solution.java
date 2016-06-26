package Husband;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution {

   @Test
   public void basicTests() {
      assertEquals(Solution.match(new int[]{15, 24, 12}, 4), "No match!");
      assertEquals(Solution.match(new int[]{26, 23, 19}, 3), "Match!");
      assertEquals(Solution.match(new int[]{11, 25, 36}, 1), "No match!");
      assertEquals(Solution.match(new int[]{22, 9, 24}, 5), "Match!");
      assertEquals(Solution.match(new int[]{8, 11, 4}, 10), "Match!");
      assertEquals(Solution.match(new int[]{17, 31, 21}, 2), "No match!");
      assertEquals(Solution.match(new int[]{34, 25, 36}, 1), "Match!");
      assertEquals(Solution.match(new int[]{35, 35, 29}, 0), "No match!");
      assertEquals(Solution.match(new int[]{35, 35, 30}, 0), "Match!");
      assertEquals(Solution.match(new int[]{35, 35, 31}, 0), "Match!");
   }

   public static String match(int[] usefulness, int months) {
      String result = "No match!";
      double usfullnessRating = 0;
      double womanRating = 100;
      for (int i = 0; i < usefulness.length; i++) {
         usfullnessRating += usefulness[i];
      }
      if (months != 0) {
//         womanRating = 100 * Math.exp(-0.15 * months);
         for (int i = 0; i < months; i++) {
            womanRating -= womanRating * 0.15;
         }
      }
      if (usfullnessRating >= womanRating) {
         result = "Match!";
      }
      return result;
   }
}