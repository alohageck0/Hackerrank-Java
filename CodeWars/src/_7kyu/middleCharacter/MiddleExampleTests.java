package _7kyu.middleCharacter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MiddleExampleTests {
   @Test
   public void evenTests() {
      assertEquals("es", Kata.getMiddle("test"));
      assertEquals("dd", Kata.getMiddle("middle"));
   }

   @Test
   public void oddTests() {
      assertEquals("t", Kata.getMiddle("testing"));
      assertEquals("A", Kata.getMiddle("A"));
   }
}

class Kata {
   public static String getMiddle(String word) {
      if (word.length() == 1) {
         return word;
      }
      int middle = word.length() / 2;
      return word.length() % 2 == 0 ? word.substring(middle - 1, middle + 1) : String.valueOf(word.charAt(middle));
   }
}
