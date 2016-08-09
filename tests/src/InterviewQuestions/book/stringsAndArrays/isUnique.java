package InterviewQuestions.book.stringsAndArrays;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

public class isUnique {


   @Test
   public void test() {
      assertTrue(isUnique("azxcvbmret"));
      assertFalse(isUnique("asasddc"));
   }

   public boolean isUnique(String input) {
      if (input.length() > 128) {
         return false;
      }
      boolean[] asciiCodeArray = new boolean[128];
      for (int i = 0; i < input.length(); i++) {
         int asciiCode = input.charAt(i);
         if (asciiCodeArray[asciiCode]) {
            return false;
         }
         asciiCodeArray[asciiCode] = true;

      }
      return true;
   }
}
