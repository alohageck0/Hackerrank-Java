package InterviewQuestions.book.stringsAndArrays;

import org.testng.annotations.Test;

import java.util.Arrays;

public class ZeroMatrix {
   private int[][] matrix = {{10, 0, 30, 40}, {11, 21, 0, 41}, {10, 0, 30, 40}, {0, 22, 32, 42}, {13, 0, 33, 43}, {0, 21, 0, 41}};

   public int[][] getMatrix() {
      return matrix;
   }

   @Test
   public void test() {
      ZeroMatrix m = new ZeroMatrix();
      System.out.println(Arrays.deepToString(getMatrix()).replaceAll("],", "\n"));

      System.out.println(Arrays.deepToString(m.replaceZeros(matrix)).replaceAll("],", "\n"));
//      System.out.println(Arrays.deepToString(matrix1).replaceAll("],", "\n"));
//      System.out.println(Arrays.deepToString(m.rotateMatrix(matrix1)).replaceAll("],", "\n"));
   }

   public int[][] replaceZeros(int[][] matrix) {
      for (int i = 0; i < matrix.length; i++) {
         boolean flag = false;
         for (int j = 0; j < matrix[i].length; j++) {
            if (matrix[i][j] == 0) {
               flag = true;
            }
            if (flag) {
               matrix[i][j] = 0;
            }
         }
      }
      return matrix;
   }
}
