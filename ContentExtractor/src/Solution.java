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
            int endOpenTag = 0;
            while (true) {
                if (endOpenTag >= line.length()) {
                    break;
                }
                int startOpenTag = line.indexOf('<', endOpenTag);
                endOpenTag = line.indexOf('>', startOpenTag);

                String openTag = line.substring(startOpenTag + 1, endOpenTag);
                int startCloseTag = line.indexOf('<', endOpenTag);
                int endCloseTag = line.indexOf('>', startCloseTag);
                if (line.charAt(startCloseTag + 1) != '/') {
                    endOpenTag = startCloseTag;
                    continue;
                } else if (openTag.equals(line.substring(startCloseTag + 2, endCloseTag))) {
                    System.out.println(line.substring(endOpenTag + 1, startCloseTag));
                    endOpenTag = endCloseTag + 1;
                }else if(!openTag.equals(line.substring(startCloseTag + 2, endCloseTag))){
                    System.out.println("None");
                    endOpenTag = endCloseTag + 1;
                }
            }
            testCases--;
        }
    }
}

