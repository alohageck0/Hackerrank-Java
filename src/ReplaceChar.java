import org.testng.Assert;
import org.testng.annotations.Test;

public class ReplaceChar {

   @Test
   public void test() {
      String inputNull = null;
      String inputEmpty = "";
      Assert.assertEquals(replace("asdfghjkl", 'f'), "asdghjkl");
      Assert.assertEquals(replaceRec("asdfghjkl", 'f'), "asdghjkl");
      Assert.assertEquals(replaceRec("aaaaaaa", 'f'), "aaaaaaa");
      Assert.assertEquals(replace("aaaaaaa", 'a'), "");
      Assert.assertEquals(replaceRec("aaaaaaa", 'a'), "");
      Assert.assertEquals(replaceRec("abababb", 'a'), "bbbb");
      Assert.assertEquals(replace("a", 'a'), "");
      Assert.assertEquals(replaceRec("a", 'a'), "");
      Assert.assertEquals(replace(inputNull, 'a'), null);
      Assert.assertEquals(replaceRec(inputNull, 'a'), null);
      Assert.assertEquals(replace(inputEmpty, 'a'), "");
      Assert.assertEquals(replaceRec(inputEmpty, 'a'), "");


   }

   public String replace(String input, char character) {
      if (input == null) {
         return null;
      }
      if (input.equals("")) {
         return "";
      }
      StringBuilder result = new StringBuilder();
      for (int index = 0; index < input.length(); index++) {
         char testChar = input.charAt(index);
         if (testChar != character) {
            result.append(testChar);
         }
      }
      return result.toString();
   }

   public String replaceRec(String input, char ch) {
      if (input == null) {
         return null;
      }
      if (input.equals("")) {
         return "";
      }
      char c = input.charAt(0);
      if (input.length() == 1) {
         if (c == ch) {
            return "";
         } else {
            return input;
         }
      } else {
         if (c == ch) {
            return replaceRec(input.substring(1), ch);
         } else {
            return c + replaceRec(input.substring(1), ch);
         }
      }
   }

}
