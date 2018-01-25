package _6kyu;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

class Squares {

   public static int findSquares(int x, int y) {
      int[][] arr = new int[x][y];
      int squares = x * y;
      for (int i = 0; i < y; i++) {
         for (int j = 0; j < x; j++) {
            for (int n = 1; n < y; n++) {
               try {
                  arr[i][j] = 1;
                  arr[i + n][j + n] = 1;
                  squares++;
               } catch (ArrayIndexOutOfBoundsException e) {
                  break;
               }
            }
         }
      }
      return squares;
   }

}

@RunWith(JUnit4.class)
public class FindSquareTest {
   @Test
   public void test1() {
      assertEquals(8, Squares.findSquares(3, 2));
   }

   @Test
   public void test2() {
      assertEquals(20, Squares.findSquares(4, 3));
   }

   @Test
   public void test3() {
      assertEquals(100, Squares.findSquares(11, 4));
   }

}

class TestRunner1 {
   static void main(String[] args) {
      Result result = JUnitCore.runClasses(FindSquareTest.class);

      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }

      System.out.println(result.wasSuccessful());
   }
}

