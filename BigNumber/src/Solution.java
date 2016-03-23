import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      BigInteger A = new BigInteger(in.nextLine());
      BigInteger B = new BigInteger(in.nextLine());

      System.out.println(A.add(B));
      System.out.println(A.multiply(B));

   }
}
