public class Sandbox {
   public static void main(String[] args) {
      int initial = 100;
      double rate = 0.15;
      int time = 2;
      System.out.println(initial * Math.exp(-rate * time));
   }
}
