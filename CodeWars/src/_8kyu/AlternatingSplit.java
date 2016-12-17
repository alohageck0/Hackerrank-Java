package _8kyu;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AlternatingSplit {

   public static String encrypt(final String text, final int n) {
      // Your code here
      StringBuilder result = new StringBuilder();
      List list1 = new ArrayList<>(Arrays.asList(text.toCharArray()));
      System.out.println(list1.get(2));
      if(text.length() == 0 || text == null || n <= 0){
         return text;
      }
      return null;
   }

   public static String decrypt(final String encryptedText, final int n) {
      // Your code here
      return null;
   }
   @Test
   public void testEncrypt() {
      // assertEquals("expected", "actual");
      assertEquals("This is a test!", AlternatingSplit.encrypt("This is a test!", 0));
//      assertEquals("hsi  etTi sats!", Kata.encrypt("This is a test!", 1));
//      assertEquals("s eT ashi tist!", Kata.encrypt("This is a test!", 2));
//      assertEquals(" Tah itse sits!", Kata.encrypt("This is a test!", 3));
//      assertEquals("This is a test!", Kata.encrypt("This is a test!", 4));
//      assertEquals("This is a test!", Kata.encrypt("This is a test!", -1));
//      assertEquals("hskt svr neetn!Ti aai eyitrsig", Kata.encrypt("This kata is very interesting!", 1));
   }


}
