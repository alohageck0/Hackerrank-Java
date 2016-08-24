package InterviewQuestions.book.stringsAndArrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveGivenChar {

   @Test
   public void test() {
      Assert.assertEquals(removeChar("abddbaddbaddn", 'b'),"addaddaddn" );
   }

   public String removeChar(String input, char charToRemove) {
      int counter = 0;
      for (int i = 0; i < input.length(); i++) {
         counter++;
         if (input.charAt(i) == charToRemove) {
            return input.substring(0, i) + removeChar(input.substring(i + 1), charToRemove);
         }
      }
      if (counter == input.length()) {
         return input;
      }
      return "";
   }
}
