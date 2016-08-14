package InterviewQuestions.book.stringsAndArrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringCompression {

   @Test
   public void test() {
      Assert.assertEquals(compressString("aabcccccaaa"), "a2b1c5a3");
   }

   public String compressString(String input) {
      if (input == null) {
         return null;
      }
      StringBuilder compressedString = new StringBuilder();
      int counter = 0;
      if (input.length() > 0) {
         String partiallyCompresed = "";
         char lastChar = input.charAt(input.length() - 1);
         for (int i = input.length() - 1; i >= 0; i--) {
            if (input.charAt(i) == lastChar) {
               counter++;
            } else {
               break;
            }
         }
         partiallyCompresed = lastChar + String.valueOf(counter);
         return compressString(input.substring(0, input.length() - counter)) + partiallyCompresed;
      } else {
         return "";
      }

   }


}
