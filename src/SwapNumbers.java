public class SwapNumbers {
   public static void main(String[] args) {
      int a = 44;
      int b = 23;
      b = a + b; // 67
      a = b - a; // 76 - 44
      b = b - a;

      System.out.printf("a = %s, b = %s", a, b);
   }


}
