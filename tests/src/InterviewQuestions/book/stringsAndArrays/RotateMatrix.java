package InterviewQuestions.book.stringsAndArrays;

import org.testng.annotations.Test;

import java.util.Arrays;

public class RotateMatrix {

   private int[][] matrix = {{10, 20, 30, 40}, {11, 21, 31, 41}, {12, 22, 32, 42}, {13, 23, 33, 43}};

   public int[][] getMatrix() {
      return matrix;
   }

   @Test
   public void test() {
      RotateMatrix m = new RotateMatrix();
      m.rotateMatrix();
      System.out.println(Arrays.deepToString(m.getMatrix()));
   }


   public void rotateMatrix() {
   }

}
