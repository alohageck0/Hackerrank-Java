import java.util.*;

//<h1>Nayeem loves counseling</h1>
//(<[a-zA-Z ]+(\d)?>)
public class Solution {

    public static String findOpenTags(String strin) {
        String tempStrin = strin;
        if (strin.charAt(0)=='<') {
            tempStrin.substring(1, tempStrin.indexOf('>'));
        }
        return tempStrin;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();

            testCases--;
        }
    }
}
