package ConvertStringToInt;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SolutionTestng {
   @Test
   public void testStringToFloat() {
      Assert.assertEquals(stringToFloat("1"), 1, 0.0001);
      Assert.assertEquals(stringToFloat("100"), 100, 0.0001);
      Assert.assertEquals(stringToFloat("100.44"), 100.44, 0.0001);
      Assert.assertEquals(stringToFloat("100.4499999"), 100.4499999, 0.0001);
      Assert.assertEquals(stringToFloat("-100.4499999"), -100.4499999, 0.0001);
      Assert.assertNull(stringToFloat("-100.4499dd999"));

      Assert.assertEquals(new Integer(1), stringToInt("1"));
      Assert.assertEquals(new Integer(100), stringToInt("100"));
      Assert.assertNull(stringToInt("letters"));
      Assert.assertEquals(new Integer(-20), stringToInt("-20"));
      Assert.assertNull(stringToInt("-20l"));

   }

   /**
    * This function takes in a string and converts it to a number!
    *
    * @param input - String that should be converted
    * @return float - Float of input string number
    */
   public Float stringToFloat(String input) {
      String[] parts = input.split("\\.");
      if (parts.length == 2) {
         int decimals = parts[1].length();

         float wholePart = 0;
         float decimalPart = 0;
         try {
            wholePart = stringToInt(parts[0]);
            decimalPart = (float) (stringToInt(parts[1]) * Math.pow(10, -decimals));
            if (wholePart < 0) {
               return wholePart - decimalPart;
            } else {
               return wholePart + decimalPart;
            }
         } catch (Exception e) {
            return null;
         }
      }

      return (float) stringToInt(input);
   }

   /**
    * This function takes in a string and converts it to a number!
    *
    * @param input - String that should be converted
    * @return int - Integer of input string number
    */
   public Integer stringToInt(String input) {
      int minus = 1;
      if (input.charAt(0) == '-') {
         minus = -1;
         input = input.substring(1);
      }

      int returnInt = 0;

      int stringLength = input.length();

      //100
      for (int i = stringLength - 1; i != -1; i--) {


         char singleChar = input.charAt(i);
         //0
         int singleDigit;

         try {
            singleDigit = Integer.parseInt(Character.toString(singleChar));
            // int 0 - int 0
         } catch (NumberFormatException e) {
            return null;
         }
         // Find which "place" we are in the string and multiply by
         // 10^N to add this digit into the output

         returnInt += singleDigit * Math.pow(10, stringLength - i - 1);

      }
      return returnInt * minus;
   }
}
