package InterviewQuestions.book.stringsAndArrays;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ZeroMatrix {
   private int[][] matrix = {{10, 0, 30, 40}, {11, 21, 23, 41}, {10, 0, 30, 40}, {1, 22, 32, 42}, {13, 33, 0, 43}, {1, 21, 3, 41}};

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
      boolean[] zeroRows = new boolean[matrix.length];
      boolean[] zeroCols = new boolean[matrix[0].length];
      for (int i = 0; i < matrix.length; i++) {
         for (int j = 0; j < matrix[i].length; j++) {
            if (matrix[i][j] == 0) {
               zeroCols[j] = true;
               zeroRows[i] = true;
            }
         }
      }
      for (int i = 0; i < matrix.length; i++) {
         for (int j = 0; j < matrix[i].length; j++) {
            if (zeroRows[i] || zeroCols[j]) {
               matrix[i][j] = 0;
            }
         }
      }


      return matrix;
   }
}
