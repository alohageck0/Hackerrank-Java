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
      System.out.println(Arrays.deepToString(m.getMatrix()).replaceAll("],","\n"));
      m.rotateMatrix();
      System.out.println(Arrays.deepToString(m.getMatrix()).replaceAll("],","\n"));
   }

//todo other pixels in layers
   public void rotateMatrix() {
      int layers = (int) Math.sqrt(matrix.length);
      int max = matrix.length - 1;
      for (int i = 0; i < layers; i++) {
         int temp = matrix[max - i][i];
         matrix[max - i][i] = matrix[max - i][max - i];
         matrix[max - i][max - i] = matrix[i][max - i];
         matrix[i][max - i] = matrix[i][i];
         matrix[i][i] = temp;
      }
   }

}
