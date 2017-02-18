import org.testng.Assert;
import org.testng.annotations.Test;

public class ReplaceChar {

   @Test
   public void test() {
      String inputNull = null;
      String inputEmpty = "";
      Assert.assertEquals(replace("asdfghjkl", 'f'), "asdghjkl");
      Assert.assertEquals(replace("aaaaaaa", 'a'), "");
      Assert.assertEquals(replace("a", 'a'), "");
      Assert.assertEquals(replace(inputNull, 'a'), null);
      Assert.assertEquals(replace(inputEmpty, 'a'), "");
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



}
