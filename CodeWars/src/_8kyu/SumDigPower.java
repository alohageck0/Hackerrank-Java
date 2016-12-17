package _8kyu;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SumDigPower {
   public static List<Long> sumDigPow(long a, long b) {
      List<Long> result = new ArrayList<>();
//
      for (long number = a; number <= b; number++) {

         char[] arrayOfDigits = String.valueOf(number).toCharArray();
         if (arrayOfDigits.length == 1) {
            result.add(number);
            continue;
         }
         long sum = 0;
         for (int index = arrayOfDigits.length - 1; index >= 0; index--) {
            long digit = Character.getNumericValue(arrayOfDigits[index]);
            double digitInPow = Math.pow(digit, (index + 1));
            sum += digitInPow;
            if (sum > number) {
               break;
            }
         }
         if (sum == number) {
            result.add(number);
         }
      }
      return result;
   }

   private static void testing(long a, long b, long[] res) {
      assertEquals(Arrays.toString(res),
              Arrays.toString(SumDigPower.sumDigPow(a, b).toArray()));
   }

   @Test
   public void test() {
      System.out.println("Basic Tests");
      testing(1, 10, new long[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
      testing(1, 100, new long[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 89});
      testing(10, 100, new long[]{89});
      testing(90, 100, new long[]{});
      testing(90, 150, new long[]{135});
      testing(50, 150, new long[]{89, 135});
      testing(10, 150, new long[]{89, 135});
   }
}
