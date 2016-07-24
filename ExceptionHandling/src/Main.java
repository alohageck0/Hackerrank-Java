import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      try {
         divide();
      } catch (InputMismatchException | ArithmeticException e) {
         if (e instanceof InputMismatchException) {
            System.out.println(e.getClass().getName());
         } else {
            System.out.println(e);
         }
      }
   }

   static void divide() {
      Scanner scanner = new Scanner(System.in);
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      System.out.println(x / y);
   }
}
