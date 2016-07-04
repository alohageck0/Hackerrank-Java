package InterviewQuestions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Factorial {

   @Test
   public void testFactorial() {
      Assert.assertEquals(getFactorialLoop(3), 6);
      Assert.assertEquals(getFactorialRecursive(3), 6);
      Assert.assertEquals(getFactorialRecursive(-122), 0);
   }

   static int getFactorialLoop(int number) {
      int result = number;
      while (number > 1) {
         result *= (number - 1);
         number--;
      }
      return result;
   }

   static int getFactorialRecursive(int number) {
      if (number < 0) {
         return 0;
      }
      if (number > 0) {
         return number * getFactorialRecursive(number - 1);
      } else {
         return 1;
      }
   }
}
