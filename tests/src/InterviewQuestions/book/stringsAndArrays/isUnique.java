package InterviewQuestions.book.stringsAndArrays;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

public class isUnique {


   @Test
   public void test() {
      assertTrue(isUnique("azxcvbmret"));
      assertTrue(isUnique1("azxcvbmret"));
      assertFalse(isUnique("asasddc"));
      assertFalse(isUnique1("asasddc"));
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

   public boolean isUnique1(String input){
      boolean[] chars = new boolean[128];
      for (char c: input.toCharArray()){
         int index = (int) c;
         if (chars[index]){
            return false;
         }else{
            chars[index] = true;
         }
      }
      return true;
   }
}
