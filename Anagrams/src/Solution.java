import java.io.*;
import java.util.*;

public class Solution {

    static boolean isAnagram(String A, String B) {
        HashMap<Character, Integer> hashMapA = new HashMap<>();
        HashMap<Character, Integer> hashMapB = new HashMap<>();
        for (int i = 0; i < A.length(); i++) {
            char lowerA = Character.toLowerCase(A.charAt(i));
            char lowerB = Character.toLowerCase(B.charAt(i));
            if (!hashMapA.containsKey(lowerA)) {
                hashMapA.put(lowerA, 1);
            } else if (!hashMapB.containsKey(lowerB)) {
                hashMapB.put(lowerB, 1);
            } else {
                hashMapA.put(lowerA, hashMapA.get(lowerA) + 1);
                hashMapB.put(lowerB, hashMapB.get(lowerB) + 1);
            }
        }
        System.out.println(hashMapA.values());
        System.out.println(hashMapB.values());
        for (int C :
                hashMapA.values()) {
            if (C != 2) return false;
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
