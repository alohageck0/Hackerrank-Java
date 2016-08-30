package InterviewQuestions.book.stringsAndArrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CountVowels {

   @Test
   public void test() {
      Assert.assertEquals(countVowels("aaaa"), 4);
      Assert.assertEquals(countVowels("aaaaba"), 5);
      Assert.assertEquals(countVowels("auioeyaba"), 7);
      Assert.assertEquals(countVowels("bbbbb"), 0);


   }

   public int countVowels(String input) {
      int count = 0;
      for (int i = 0; i < input.length(); i++) {
         switch ((int) input.charAt(i)) {
            case (int) 'a':
               count++;
               break;
            case (int) 'u':
               count++;
               break;
            case (int) 'i':
               count++;
               break;
            case (int) 'o':
               count++;
               break;
            case (int) 'e':
               count++;
               break;
         }
      }
      return count;
   }
}
