package _8kyu;

import java.util.Arrays;

/**
 * Description:
 * <p>
 * Given an array of integers.
 * <p>
 * Return an array, where the first element is the count of positives numbers and the
 * second element is sum of negative numbers.
 * If the input array is empty or null, return an empty array:
 * <p>
 * C#/Java: new int[] {} / new int[0];
 * C++: std::vector<int>();
 * JavaScript/CoffeeScript/PHP: [];
 * ATTENTION!
 * <p>
 * The passed array should NOT be changed. Read more here.
 * <p>
 * For example:
 * <p>
 * input int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}
 * return int[] {10, -65}.
 */

public class CountOfPositives {

   public static int[] countPositivesSumNegatives(int[] input) {
      int[] result = new int[2];
      if (input == null) {
         return new int[0];
      }
      for (int number : input) {
         if (number > 0) {
            result[0]++;
         } else if (number < 0) {
            result[1] += number;
         }
      }
      return result;
   }

   public static void main(String[] args) {
      CountOfPositives test = new CountOfPositives();
      int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
      System.out.println(Arrays.toString(countPositivesSumNegatives(input)));

   }
}
