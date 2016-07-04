package InterviewQuestions;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class PrimeNumbers {
   /**
    * How to get the prime numbers between a given range.
    */

   @Test
   public void testPrimes() {
      Assert.assertNull(getPrimesBetweenRange(1411, 1420));
      Assert.assertEquals(getPrimesBetweenRange(0, 15), "[2, 3, 5, 7, 11, 13]");
      Assert.assertEquals(getPrimesBetweenRange(0, 15), "[2, 3, 5, 7, 11, 13]");
      Assert.assertEquals(getPrimesBetweenRange(0, 15), "[2, 3, 5, 7, 11, 13]");
      Assert.assertEquals(getPrimesBetweenRange(1190, 1212), "[1193, 1201]");
      Assert.assertEquals(getPrimesBetweenRange(1277, 1212), "Not valid range");
      Assert.assertEquals(getPrimesBetweenRange(1277, 1298), "[1277, 1279, 1283, 1289, 1291, 1297]");
   }

   String getPrimesBetweenRange(int start, int end) {

      if (end < start) {
         return "Not valid range";
      }
      ArrayList<Integer> result = new ArrayList<>();
      for (int checkingNumber = start; checkingNumber <= end; checkingNumber++) {
         if (checkingNumber == 0 || checkingNumber == 1) {
            continue;
         }
         boolean isPrime = true;
         for (int divisor = (int) Math.sqrt(checkingNumber); divisor > 1; divisor--) {
            if (checkingNumber % divisor == 0) {
               isPrime = false;
            }
         }
         if (isPrime) {
            result.add(checkingNumber);
         }
      }

      if (result.size() > 0) {
         return result.toString();
      } else {
         return null;
      }
   }
}
