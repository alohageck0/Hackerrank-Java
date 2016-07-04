package InterviewQuestions;

public class SwapNumbers {
   public static void main(String[] args) {
      int a = 90;
      int b = 10;

      a += b;
      b = a - b;
      a -= b;

      System.out.println("a = " + a);
      System.out.println("b = " + b);
   }
}
