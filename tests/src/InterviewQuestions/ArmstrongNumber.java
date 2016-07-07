package InterviewQuestions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArmstrongNumber {
   /**
    * Note- A number is armstrong if the sum of the cubes of digit of number is equal to the number.
    * ex- 407 = 4*4*4 + 0*0*0 + 7*7*7
    */

   @Test
   public void testArmstorng() {
      Assert.assertTrue(isArmstrong(407));
      Assert.assertFalse(isArmstrong(407));
   }

   boolean isArmstrong(int number) {
      boolean result = false;
      int sumOfCubes = 0;
      char[] digitsArray = Integer.toString(number).toCharArray();
      for (char digit : digitsArray) {
         sumOfCubes += Math.pow((double) digit, 3);
      }
      if (number == sumOfCubes) {
         result = true;
      }
      return result;
   }
}
