package InterviewQuestions.book.stringsAndArrays;

import org.testng.annotations.Test;

public class CountTwos {

   @Test
   public void test() {
      System.out.println(count(4));
      System.out.println(count(0));
      System.out.println(count(44));
   }

   public int count(int max) {
      int result = 0;
      for (int i = 0; i < max; i++) {
         result += howManyTwosInNumber(i);
      }
      return result;
   }

   public int howManyTwosInNumber(int number) {
      int count = 0;
      String numberString = String.valueOf(number);
      for (int i = 0; i < numberString.length(); i++) {
         if (numberString.charAt(i) == '2') {
            count++;
         }
      }
      return count;
   }
}
