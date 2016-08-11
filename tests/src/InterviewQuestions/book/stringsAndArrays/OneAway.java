package InterviewQuestions.book.stringsAndArrays;

import org.testng.Assert;
import org.testng.annotations.Test;


public class OneAway {

   @Test
   public void test() {
      Assert.assertTrue(ifOneAwayEdit("pale", "ple"));
      Assert.assertTrue(ifOneAwayEdit("pales", "pale"));
      Assert.assertTrue(ifOneAwayEdit("pale", "bale"));
      Assert.assertFalse(ifOneAwayEdit("pale", "bake"));
      Assert.assertFalse(ifOneAwayEdit("pale", "bake"));
      Assert.assertFalse(ifOneAwayEdit("pale", "paleee"));
      Assert.assertTrue(ifOneAwayEdit("pale", "pale"));
   }

   public boolean ifOneAwayEdit(String fisrtStr, String secondStr) {
      if (Math.abs(fisrtStr.length() - secondStr.length()) > 1) {
         return false;
      } else if (fisrtStr.length() == secondStr.length()) {
         if (fisrtStr.equals(secondStr)) {
            return true;
         }
         int flag = countEdits(fisrtStr, secondStr);
         return flag <= 1;
      } else {
         int index = findIndex(fisrtStr, secondStr);
         if (fisrtStr.length() < secondStr.length()) {
            return fisrtStr.substring(index).equals(secondStr.substring(index + 1));
         } else {
            return secondStr.substring(index).equals(fisrtStr.substring(index + 1));
         }
      }


   }

   private int findIndex(String fisrtStr, String secondStr) {
      char[] arrayOfFirstString = fisrtStr.toCharArray();
      char[] arrayOfSecondString = secondStr.toCharArray();
      int minLength = Math.min(arrayOfFirstString.length, arrayOfSecondString.length);
      for (int i = 0; i < minLength; i++) {
         if (arrayOfFirstString[i] != arrayOfSecondString[i]) {
            return i;
         }
      }
      return minLength;
   }

   private int countEdits(String fisrtStr, String secondStr) {
      int countEdits = 0;
      char[] arrayOfFirstString = fisrtStr.toCharArray();
      char[] arrayOfSecondString = secondStr.toCharArray();
      int minLength = Math.min(arrayOfFirstString.length, arrayOfSecondString.length);
      for (int i = 0; i < minLength; i++) {
         if (countEdits > 2) {
            break;
         }
         if (arrayOfFirstString[i] != arrayOfSecondString[i]) {
            countEdits++;
         }
      }
      return countEdits;
   }

}
