import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseStr {

   @Test
   public void test() {
      String nullStr = null;
      Assert.assertEquals(reverse("asdfg"), "gfdsa");
      Assert.assertEquals(reverseRec("asdfg"), "gfdsa");
      Assert.assertEquals(reverse(""), "");
      Assert.assertEquals(reverseRec(""), "");
      Assert.assertEquals(reverse(nullStr), null);
      Assert.assertEquals(reverseRec(nullStr), null);
   }

   String reverse(String input) {
      if (input == null) {
         return null;
      }
      if (input.length() < 1) {
         return "";
      }
      StringBuilder result = new StringBuilder();
      for (int start = input.length() - 1; start >= 0; start--) {
         result.append(input.charAt(start));
      }
      return result.toString();
   }

   String reverseRec(String input) {
      if (input == null) {
         return null;
      }
      if (input.length() < 1) {
         return "";
      }
      if (input.length() == 1) {
         return input;
      } else {
         int lastCharIndex = input.length() - 1;
         char lastChar = input.charAt(lastCharIndex);
         return lastChar + reverseRec(input.substring(0, lastCharIndex));
      }
   }
}
