package InterviewQuestions.book.stringsAndArrays;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.regex.Pattern;

public class OnlyDigits {

   @Test
   public void test() {
      Assert.assertTrue(ifContainsDigitsRegEx("ldl3d"));
      Assert.assertTrue(ifContainsDigitsRegEx("ldld4"));
      Assert.assertTrue(ifContainsDigitsRegEx("1ldld"));
      Assert.assertFalse(ifContainsDigitsRegEx("ldld"));
   }

   public boolean ifContainsDigits(String input) {
      for (char chatacter : input.toCharArray()) {
         if ((int) chatacter >= 48 && (int) chatacter <= 57) {
            return true;
         }
      }
      return false;
   }

   public boolean ifContainsDigitsRegEx(String input) {
      Pattern pattern = Pattern.compile(".*(\\d)+.*");
      if (pattern.matcher(input).matches()) {
         return true;
      } else {
         return false;
      }
   }
}
