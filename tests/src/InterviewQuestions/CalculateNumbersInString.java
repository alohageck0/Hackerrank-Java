package InterviewQuestions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculateNumbersInString {
   /**
    * How to calculate sum of all numbers in a string. Example 11aa22bb33dd44 =110
    */

   @Test
   public void test() {
      Assert.assertEquals(countNumbers("11aa22bb33dd44"), 110);

//      System.out.println(findLastDigitIndex("11aa22bb33dd44", 4));
   }

   //   public int countNumbers(String input) {
//
//      int result = 0;
//      int i;
//      for (i = 0; i < input.length(); i++) {
//         if (Character.isDigit(input.charAt(i))) {
//            int end = findLastDigitIndex(input, i);
//            result += Integer.valueOf(input.substring(i, end));
//         }
//      }
//
//      return result;
//   }
//
//   public int findLastDigitIndex(String input, int start) {
//      int lastDigit = start;
//      for (int i = start; i < input.length(); i++) {
//         if (!Character.isDigit(input.charAt(i))) {
//            lastDigit = i;
//         }
//      }
//      return lastDigit;
//   }

   //todo think
   public int countNumbers(String input) {
      if (input.length() == 0) {
         return 0;
      }
      int start = 0;
      int end = 0;
      for (int i = 0; i < input.length(); i++) {
         if (Character.isDigit(input.charAt(i))) {
            start = i;
            end = findEnd(input, start);
         }
      }
      return Integer.valueOf(input.substring(start, end)) + countNumbers(input.substring(end));
   }

   public int findEnd(String string, int start) {
      int end = start;
      for (int i = start + 1; i < string.length(); i++) {
         if (Character.isDigit(string.charAt(i))) {
            end++;
         } else {
            break;
         }

      }
      return end;
   }
}