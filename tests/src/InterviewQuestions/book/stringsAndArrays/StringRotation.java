package InterviewQuestions.book.stringsAndArrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringRotation {

   @Test
   public void test() {
      Assert.assertTrue(isRoatation("waterbottle", "erbottlewat"));

   }

   public boolean isRoatation(String s1, String s2) {
      int len = s1.length();
      if (s2.length() == len && len > 0) {
         String s1s1 = s1 + s1;
         return isSubstring(s1s1, s2);
      }
      return false;

   }

   public boolean isSubstring(String s1, String s2) {
      if (s1.contains(s2)) {
         return true;
      } else {
         return false;
      }
   }
}
