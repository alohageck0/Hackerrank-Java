package InterviewQuestions.book.stringsAndArrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PalindromePermutation {
   @Test
   public void test() {
      assertTrue(ifPalindromPermutation("Tact Coao"));
      assertTrue(ifPalindromPermutation("Tact Coa"));
      assertFalse(ifPalindromPermutation("Tact3 Coa"));
      assertTrue(ifPalindromPermutation("Tact Coa"));
   }

   public boolean ifPalindromPermutation(String input) {
      int[] arrChars = new int[128];
      for (char c : input.toLowerCase().toCharArray()) {
         if (c != ' ') {
            arrChars[c]++;
         }
      }
      int charCount = 0;
      int oddCount = 0;
      for (int b : arrChars) {
         if (b > 0) {
            charCount += b;
            if (b % 2 != 0) {
               oddCount++;
            }
         }
      }
      System.out.println(charCount + " " + oddCount);
      if (charCount % 2 != 0) {
         if (oddCount != 1) {
            return false;
         }
      } else {
         if (oddCount > 0) {
            return false;
         }
      }
      return true;

   }
}
