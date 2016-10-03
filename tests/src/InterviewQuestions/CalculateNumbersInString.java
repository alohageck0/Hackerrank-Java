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
      Assert.assertEquals(countNumbers("dfsd7788fsdf733sdfsd93"), 8614);
      Assert.assertEquals(countNumbers("sdf7sdf7s7d8f87sdf78s78d"), 272);
      Assert.assertEquals(countNumbers("cs672njcd992cd9cd0"), 1673);
      Assert.assertEquals(countNumbers("aaa100"), 100);
      Assert.assertEquals(countNumbers("304022993"), 304022993);

//      System.out.println(findLastDigitIndex("11aa22bb33dd44", 4));
   }
//todo debug whole number
   private int countNumbers(String input) {
      int result = 0;
      for (int i = 0; i < input.length(); i++) {
         if (Character.isDigit(input.charAt(i))) {
            int start = i;
            for (int j = i; j < input.length(); j++) {
               if ((j + 1) == input.length()) {
                  result += Integer.valueOf(input.substring(start));
                  i++;
                  break;
               } else {
                  if (!Character.isDigit(input.charAt(j + 1))) {
                     result += Integer.valueOf(input.substring(start, j + 1));
                     i = j + 1;
                     break;
                  }
               }
            }
         }
      }
      return result;
   }

//   public int countNumbers(String input) {
//
//            int result = 0;
//            int i;
//            for (i = 0; i < input.length(); i++) {
//               if (Character.isDigit(input.charAt(i))) {
//                  int lastDigit=i;
//                  for (int j = i; j < input.length(); j++) {
//               if (Character.isDigit(input.charAt(j + 1))) {
//                  lastDigit++;
//               } else {
//                  break;
//               }
//            }
//            result += Integer.valueOf(input.substring(i, lastDigit));
//         }
//      }
//      return result;
//   }
//
//   public int findLastDigitIndex(String input, int start) {
//      int lastDigit = start;
//      for (int i = start; i < input.length(); i++) {
//         if (Character.isDigit(input.charAt(i + 1))) {
//            lastDigit++;
//         } else {
//            break;
//         }
//      }
//      return lastDigit;
//   }

//todo think
//   public int countNumbers(String input) {
//      if (input.length() == 0) {
//         return 0;
//      }
//      int start = 0;
//      int end = 0;
//      for (int i = 0; i < input.length(); i++) {
//         if (Character.isDigit(input.charAt(i))) {
//            start = i;
//            end = findEnd(input, start);
//         }
//      }
//      return Integer.valueOf(input.substring(start, end)) + countNumbers(input.substring(end));
//   }
//
//   public int findEnd(String string, int start) {
//      int end = start;
//      for (int i = start + 1; i < string.length(); i++) {
//         if (Character.isDigit(string.charAt(i))) {
//            end++;
//         } else {
//            break;
//         }
//
//      }
//      return end;
//   }
}