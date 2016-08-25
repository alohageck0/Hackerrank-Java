package InterviewQuestions.book.stringsAndArrays;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static sun.misc.Version.print;

public class PrintDuplicateChars {

   @Test
   public void test() {
      String test = new String();
      String test1 = "";
      System.out.println(printDuplicates("sdfsdfjjsdijfsdjfjsdfjsdjfsdnfkjsdnjfnsdnfskdjnf"));
      Assert.assertEquals(printDuplicates("asdfghjklertyu"), "No duplicates");
      Assert.assertNull(printDuplicates(test));
      Assert.assertNull(printDuplicates(test1));
      System.out.println(printDuplicates("sdfsdfjjsdijfsdjfjsdfjsdjfsdnfkjsdnjfnsdnfskdjnf"));
   }

   private String printDuplicates(String input) {
      if (input == null || input.length() < 1) {
         return null;
      }
      StringBuilder output = new StringBuilder();
      Map<Character, Integer> characters = new LinkedHashMap<>();
      for (int i = 0; i < input.length(); i++) {
         char key = input.charAt(i);
         if (!output.toString().contains(String.valueOf(key))) {
            if (!characters.containsKey(key)) {
               characters.put(key, 1);
            } else {
               output.append(key);
            }
         }
      }
      String out = output.toString();
      if (out.length() < 1) {
         return "No duplicates";
      } else {
         return output.toString();

      }
   }

}
