package InterviewQuestions;

public class FizzBuzz {
   public static void main(String[] args) {
      printFizzBuzz();
   }

   static void printFizzBuzz() {
      for (int i = 0; i <= 50; i++) {
         String fizz = "Fizz";
         String buzz = "Buzz";
         if (i % 15 == 0) {
            System.out.println(fizz + buzz);
         } else if (i % 3 == 0) {
            System.out.println(fizz);
         } else if (i % 5 == 0) {
            System.out.println(buzz);
         } else {
            System.out.println(i);
         }
      }
   }
}
