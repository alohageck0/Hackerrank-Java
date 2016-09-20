package InterviewQuestions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MostCommonDivisor {
   @Test
   public void test() {
      simplify(2, 4);
   }

   //   public void simplify(int numerator, int denominator) {
//      if (numerator < denominator) {
//         if (denominator % numerator == 0) {
//            System.out.printf("%s %s", 1, denominator / numerator);
//         }
//      } else {
//         if (numerator % denominator == 0) {
//            System.out.printf("%s %s", 1, numerator / denominator);
//         }
//      }
//      int maxDiv;
//      if (numerator < denominator) {
//         maxDiv = denominator / numerator;
//      } else {
//         maxDiv = numerator / denominator;
//      }
//      for (int i = maxDiv;i>)
//
//   }
   public void simplify(int numerator, int denominator) {
      while (denominator!=0){
         int temp = denominator;
         denominator = temp;
      }
   }

}
