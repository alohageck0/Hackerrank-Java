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
      System.out.println(printDuplicates("sdfsdfjjsdijfsdjfjsdfjsdjfsdnfkjsdnjfnsdnfskdjnf"));
   }

   private String printDuplicates(String input) {
      StringBuilder output = new StringBuilder();
      Map<Character, Integer> characters = new LinkedHashMap<>();
      for (int i = 0; i < input.length(); i++) {
         char key = input.charAt(i);
         if (!output.toString().contains(String.valueOf(key))){
            if (!characters.containsKey(key)) {
               characters.put(key, 1);
            } else {
               output.append(key);
            }
         }
      }
      return output.toString();
   }

}
