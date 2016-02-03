import java.io.*;
import java.util.*;


public class Solution {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        StringTokenizer token = new StringTokenizer(s, " !,?.\\_'@");
        System.out.println(token.countTokens());
        while (token.hasMoreTokens()){
            System.out.println(token.nextToken());
        }
    }
}
