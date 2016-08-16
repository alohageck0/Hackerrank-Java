package InterviewQuestions.book.stringsAndArrays;

import org.testng.annotations.Test;

import java.util.Arrays;

public class RotateMatrix {

   private int[][] matrix = {{10, 20, 30, 40}, {11, 21, 31, 41}, {12, 22, 32, 42}, {13, 23, 33, 43}};
   private int[][] matrix1 = {{21, 31}, {22, 32}};

   public int[][] getMatrix() {
      return matrix;
   }

   @Test
   public void test() {
      RotateMatrix m = new RotateMatrix();
      System.out.println(Arrays.deepToString(matrix).replaceAll("],", "\n"));
      System.out.println(Arrays.deepToString(m.rotateMatrix(matrix)).replaceAll("],", "\n"));
      System.out.println(Arrays.deepToString(matrix1).replaceAll("],", "\n"));
      System.out.println(Arrays.deepToString(m.rotateMatrix(matrix1)).replaceAll("],", "\n"));
   }

   //todo edit to swap inner
   public int[][] rotateMatrix(int[][] matrix) {
      int layers = matrix.length / 2;
      int max = matrix.length - 1;
      for (int layer = 0; layer < layers; layer++) {
         for (int i = layer; i < max; i++) {
            int temp = matrix[layer][i];
            //left - to top
            matrix[layer][i] = matrix[max - i][layer];

            //bottom to left
            matrix[max - i][layer] = matrix[max - layer][max - i];

            //right to bottom
            matrix[max - layer][max - i] = matrix[i][max];

            matrix[i][max] = temp;
         }
         max--;
      }
      return matrix;
   }

}
