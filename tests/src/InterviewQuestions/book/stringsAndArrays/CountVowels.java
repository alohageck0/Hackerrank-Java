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
      for (char c:input.toCharArray()) {
         switch (c) {
            case 'a':
               count++;
               break;
            case 'u':
               count++;
               break;
            case 'i':
               count++;
               break;
            case 'o':
               count++;
               break;
            case 'e':
               count++;
               break;
         }
      }
      return count;
   }
}
