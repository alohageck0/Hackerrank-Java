package InterviewQuestions.book.stringsAndArrays;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static com.sun.tools.javac.jvm.ByteCodes.ret;

public class FirstNonRepeatedSChar {

   @Test
   public void test() {
      String test = "w";
      String test1 = "";
      Assert.assertEquals(getFirstNonRepeatedChar("asdasdffv"), 'v');
      Assert.assertEquals(getNonRepRecursive("asdasdffv"), "v");
      Assert.assertEquals(getFirstNonRepeatedChar("agsdasdffv"), 'g');
      Assert.assertEquals(getNonRepRecursive("agsdasdffv"), "g");
      Assert.assertEquals(getFirstNonRepeatedChar("agsdasdffv"), 'g');
      Assert.assertEquals(getFirstNonRepeatedChar(test), 'w');
      Assert.assertEquals(getFirstNonRepeatedChar(test1), ' ');
   }

   public char getFirstNonRepeatedChar(String input) {
      char result = ' ';
      if (input.length() == 0) {
         return result;
      } else if (input.length() == 1) {
         return input.charAt(0);
      } else {
         Map<Character, Integer> chars = new LinkedHashMap<>();
         for (int i = 0; i < input.length(); i++) {
            char key = input.charAt(i);
            if (chars.containsKey(key)) {
               chars.put(key, chars.get(key) + 1);
            } else {
               chars.put(key, 1);
            }
         }
         for (Character key : chars.keySet()) {
            if (chars.get(key) == 1) {
               result = key;
               break;
            }
         }
      }
      return result;
   }

   public String getNonRepRecursive(String input) {
      if (input.length() == 1) {
         return input;
      } else {
         char c = input.charAt(0);
         for (int i = 1; i < input.length(); i++) {
            if (c == input.charAt(i)) {
               return getNonRepRecursive(input.replaceAll(String.valueOf(c), ""));
            }
         }
         return String.valueOf(c);
      }
   }
}
