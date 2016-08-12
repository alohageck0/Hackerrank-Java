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
      System.out.println(getSubstring("tesla", "slate"));
   }

   public String getSubstring(String s1, String s2) {
      int stringLength = 0;
      String result = "";
      for (int i = 0; i < s1.length(); i++) {
         String testSubstring = s1.substring(i, s1.length() - 1);
         if (s2.contains(result)) {
            if (result.length()>stringLength){
               result = testSubstring;
            }
         }
      }
      return result;
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
