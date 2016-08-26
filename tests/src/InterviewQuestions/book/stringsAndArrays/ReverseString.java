package InterviewQuestions.book.stringsAndArrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseString {

   @Test
   public void test() {
      Assert.assertEquals(reverseIter("String"), "gnirtS");
      Assert.assertEquals(reverseRecursive("String"), "gnirtS");
   }

   private String reverseRecursive(String string) {
      if (string.length() != 1) {
         return reverseRecursive(string.substring(1)) + String.valueOf(string.charAt(0));
      } else {
         return string;
      }
   }

   private String reverseIter(String string) {
      StringBuilder stringBuilder = new StringBuilder(string.length());
      for (int i = string.length() - 1; i >= 0; i--) {
         stringBuilder.append(string.charAt(i));
      }
      return stringBuilder.toString();
   }


}
