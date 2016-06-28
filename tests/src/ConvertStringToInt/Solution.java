package ConvertStringToInt;

import org.junit.runner.JUnitCore;
import org.testng.Assert;
import org.testng.annotations.Test;

// Unit testing frameworks

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

public class Solution {
   @Test
   public void testStringToFloat() {
      Assert.assertEquals(1, stringToFloat("1"), 0.0001);
      Assert.assertEquals(100, stringToFloat("100"), 0.0001);

      Assert.assertEquals(new Integer(1), stringToInt("1"));
      Assert.assertEquals(new Integer(100), stringToInt("100"));
      // Assert.assertNull(stringToInt("letters"));
      Assert.assertEquals(new Integer(-20), stringToInt("-20"));


   }

   /**
    * This function takes in a string and converts it to a number!
    *
    * @param input - String that should be converted
    * @return float - Float of input string number
    */
   public float stringToFloat(String input) {
      return stringToInt(input);
   }

   /**
    * This function takes in a string and converts it to a number!
    *
    * @param input - String that should be converted
    * @return int - Integer of input string number
    */
   public Integer stringToInt(String input) {
      int minus = 1;
      if(input.charAt(0)=='-'){
         minus = -1;
         input = input.substring(1);
      }

      int returnInt = 0;

      int stringLength = input.length();

      //100
      for (int i = stringLength - 1; i != -1; i--){


         char singleChar = input.charAt(i);
         //0
         int singleDigit;

         try{
            singleDigit = Integer.parseInt(Character.toString(singleChar));
            // int 0 - int 0
         } catch (Exception e) {
            return null;
         }
         // Find which "place" we are in the string and multiply by
         // 10^N to add this digit into the output

         returnInt += singleDigit * Math.pow(10, stringLength - i - 1);

      }
      return returnInt*minus;
   }

   public static void main(String[] args) {
      JUnitCore.main("Solution");

      Solution solution = new Solution();

      System.out.print(solution.stringToInt("letters"));
   }
}


