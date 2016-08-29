package InterviewQuestions.book.stringsAndArrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OnlyDigits {

   @Test
   public void test() {
      Assert.assertTrue(ifContainsDigits("ldl3d"));
      Assert.assertTrue(ifContainsDigits("ldld4"));
      Assert.assertTrue(ifContainsDigits("1ldld"));
      Assert.assertFalse(ifContainsDigits("ldld"));
   }

   public boolean ifContainsDigits(String input) {
      for (char chatacter : input.toCharArray()) {
         if ((int) chatacter >= 48 && (int) chatacter <= 57) {
            return true;
         }
      }
      return false;
   }
}
