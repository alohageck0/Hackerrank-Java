package InterviewQuestions.book.stringsAndArrays;

import org.testng.annotations.Test;

public class Substring {
   @Test
   public void test() {
      System.out.println(getSubstring("tesla", "eslbaa"));
   }

   public String getSubstring(String s1, String s2) {
      int stringLength = 0;
      String result = "";
      for (int i = 0; i < s1.length(); i++) {
         for (int j = s1.length(); j > i; j--) {
            String test = s1.substring(i, j);
            if (test.length() < stringLength) {
               break;
            }
            if (s2.contains(test)) {
               if (test.length() > stringLength) {
                  result = test;
                  stringLength = test.length();
               }
            }
         }
      }
      return result;
   }

}
