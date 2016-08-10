package InterviewQuestions.book.stringsAndArrays;

import org.testng.annotations.Test;

public class URLify {

   @Test
   public void test() {
      System.out.println(getUrl("test ddd eefef      "));
   }

   public String getUrl(String input) {
      String[] words = input.split(" ");
      StringBuilder stringBuilder = new StringBuilder();
      for (int i = 0; i < words.length; i++) {
         if (i != words.length - 1) {
            stringBuilder.append(words[i]);
            stringBuilder.append("%20");
         } else {
            stringBuilder.append(words[i]);
         }
      }
      return stringBuilder.toString();
   }
}
