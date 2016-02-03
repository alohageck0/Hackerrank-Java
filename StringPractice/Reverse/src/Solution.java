import java.util.*;

public class Solution {
    public static String ifPalindrome(String strin) {
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for (char c : strin.toCharArray()) {
            queue.add(c);
            stack.add(c);
        }
        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                return "No";
            }
        }
        return "Yes";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        System.out.println(ifPalindrome(A));

    }
}