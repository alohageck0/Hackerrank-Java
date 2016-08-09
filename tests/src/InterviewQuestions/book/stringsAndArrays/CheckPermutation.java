package InterviewQuestions.book.stringsAndArrays;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CheckPermutation {
   @Test
   public void test(){
      assertTrue(ifPermutation("bob","bob"));
      assertTrue(ifPermutation("boa","aob"));
      assertTrue(ifPermutation("bon","nob"));
      assertFalse(ifPermutation("bo2b","bob"));
      assertFalse(ifPermutation("boob","bobb"));
   }

   private boolean ifPermutation(String input1, String input2) {
      if (input1.length() != input2.length()) {
         return false;
      }
      int[] chars = new int[128];
      for (char c : input1.toCharArray()) {
         chars[c]++;
      }
      for (char c : input2.toCharArray()) {
         chars[c]--;
         if (chars[c] < 0) {
            System.out.println(c);
            return false;
         }
      }
      return true;
   }
}
