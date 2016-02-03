import java.io.*;
import java.util.*;

public class Solution {

    static boolean isAnagram(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }
        HashMap<Character, Integer> hashMapA = new HashMap<>();
        HashMap<Character, Integer> hashMapB = new HashMap<>();
        for (int i = 0; i < A.length(); i++) {
            char lowerA = Character.toLowerCase(A.charAt(i));
            char lowerB = Character.toLowerCase(B.charAt(i));
            if (!hashMapA.containsKey(lowerA)) {
                hashMapA.put(lowerA, 1);
            } else {
                hashMapA.put(lowerA, hashMapA.get(lowerA) + 1);
            }
            if (!hashMapB.containsKey(lowerB)) {
                hashMapB.put(lowerB, 1);
            } else {
                hashMapB.put(lowerB, hashMapB.get(lowerB) + 1);
            }
        }
        for (char key : hashMapA.keySet()) {
            if (!Objects.equals(hashMapA.get(key), hashMapB.get(key))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        boolean ret = isAnagram(A, B);
        if (ret) System.out.println("Anagrams");
        else System.out.println("Not Anagrams");

    }
}
