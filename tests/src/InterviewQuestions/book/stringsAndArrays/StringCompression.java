package InterviewQuestions.book.stringsAndArrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringCompression {

   @Test
   public void test() {
      Assert.assertEquals(compressStringRecursive("aabcccccaaa"), "a2b1c5a3");
      Assert.assertEquals(compressString("aabcccccaaa"), "a2b1c5a3");
      Assert.assertEquals(compressString("aabcccccaaa"), "a2b1c5a3");
      Assert.assertEquals(compressString("asdfghjklqwertuy"), "asdfghjklqwertuy");
   }

   private String compressString(String input) {
      StringBuilder compressedString = new StringBuilder();
      int counter = 0;
      int compressedLength = countCompression(input);
      if (compressedLength > input.length()) {
         return input;
      }
      for (int i = 0; i < input.length(); i++) {
         if (compressedLength > input.length()) {
            return input;
         }
         counter++;
         if (i + 1 >= input.length() || input.charAt(i) != input.charAt(i + 1)) {
            compressedString.append(input.charAt(i));
            compressedString.append(counter);
            counter = 0;

         }
      }
      return compressedString.toString();
   }

   private int countCompression(String input) {
      int compressionCounter = 0;
      for (int i = 0; i < input.length(); i++) {
         if (i + 1 >= input.length() || input.charAt(i) != input.charAt(i + 1)) {
            compressionCounter += 2;
         }
      }
      return compressionCounter;
   }

   public String compressStringRecursive(String input) {
      if (input == null) {
         return null;
      }
      StringBuilder compressedString = new StringBuilder();
      int counter = 0;
      if (input.length() > 0) {
         String partiallyCompresed = "";
         char lastChar = input.charAt(input.length() - 1);
         for (int i = input.length() - 1; i >= 0; i--) {
            if (input.charAt(i) == lastChar) {
               counter++;
            } else {
               break;
            }
         }
         partiallyCompresed = lastChar + String.valueOf(counter);
         return compressStringRecursive(input.substring(0, input.length() - counter)) + partiallyCompresed;
      } else {
         return "";
      }

   }


}
