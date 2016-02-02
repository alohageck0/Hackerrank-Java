import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Comparable<String> A = sc.next();
        String B = sc.next();
        String a = (String) A;
        System.out.println(A.toString().length() + B.length());
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(Character.toUpperCase(a.charAt(0)) + a.substring(1) + " " + Character.toUpperCase(B.charAt(0)) + B.substring(1));
    }
}
