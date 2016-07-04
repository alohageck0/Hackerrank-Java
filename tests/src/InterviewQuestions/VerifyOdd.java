package InterviewQuestions;

public class VerifyOdd {
   public static void main(String[] args) {

      verifyEvenOrOdd(2);
      verifyEvenOrOdd(1);
      verifyEvenOrOdd(-1);
      verifyEvenOrOdd(33);
   }

   public static void verifyEvenOrOdd(double numberToVerify) {
      if (numberToVerify % 2 == 0) {
         System.out.println(numberToVerify + " is even");
      } else {
         System.out.println(numberToVerify + " is odd");
      }
   }
}
