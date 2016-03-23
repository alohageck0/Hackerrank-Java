import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();
            int end = 0;
            boolean ifNone = false;
            while (true) {
                if (end < 0) {
                    break;
                }
                int start = line.indexOf('<', end);
// try another ways

                end = line.indexOf('>', start);
                if (end < 0) {
                    ifNone = true;
                }
                String openTag = line.substring(start + 1, end);
//                System.out.println(openTag);
                int startCloseTag = line.indexOf('<', end);
//                System.out.println("Startclose" + startCloseTag);
                int endCloseTag = line.indexOf('>', startCloseTag);

//                System.out.println("Endclose" + startCloseTag);

                if (line.charAt(startCloseTag + 1) != '/') {
                    end = startCloseTag;
                    continue;
                } else if (openTag.equals(line.substring(startCloseTag + 2, endCloseTag))) {
                    String result = line.substring(end + 1, startCloseTag);
                    if (result.equals("")) {
                        ifNone = true;
                    } else {
                        System.out.println(line.substring(end + 1, startCloseTag));
                    }
                    end = endCloseTag + 1;
                } else {
                    ifNone = true;
                }
            }
            if (ifNone) {
                System.out.println("None");
            }
            testCases--;
        }
    }
}

