package InterviewQuestions.book.stringsAndArrays;

import org.testng.annotations.Test;

public class CountTwos {

   @Test
   public void test(){
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
      char[] digits = String.valueOf(number).toCharArray();
      for (char digit : digits) {
         if (digit == '2') {
            count++;
         }
      }
      return count;
   }
}
