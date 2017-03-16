package _6kyu.rainfall;

public class BouncingBall {

   public static int bouncingBall(double h, double bounce, double window) {
      int bounces = 0;
      if (h * bounce < window || bounce > 1 || h <= 0 || window <= 0 || h < window) {
         return -1;
      }
      while (h > window) {
         System.out.println(h + " " + bounce + " " + window);
         bounces++;
         h *= bounce;
         if (h >= window) {
            bounces++;
         }
      }

      return bounces;
   }

   public static void main(String[] args) {
      System.out.println(bouncingBall(3,0.66,1.5));
      System.out.println(bouncingBall(3,2,1.5));
      System.out.println(bouncingBall(3,0.66,0));
      System.out.println(bouncingBall(0,0,0));
   }
}
