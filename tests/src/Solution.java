import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//4
//        <h1>Nayeem loves counseling</h1>
//        <h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
//        <Amee>safat codes like a ninja</amee>
//        <SA premium>Imtiaz has a secret crush</SA premium>



public class Solution {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();
            int end = 0;
            while (true) {
                if (end >= line.length()) {
                    break;
                }
                int start = line.indexOf('<', end);
                end = line.indexOf('>', start);

                String openTag = line.substring(start + 1, end);
//            System.out.println(openTag);
                int startCloseTag = line.indexOf('<', end);
                int endCloseTag = line.indexOf('>', startCloseTag);
                if (line.charAt(startCloseTag + 1) != '/') {
                    end = startCloseTag;
                    continue;
                } else if (openTag.equals(line.substring(startCloseTag + 2, endCloseTag))) {
                    System.out.println(line.substring(end + 1, startCloseTag));
                    end = endCloseTag + 1;
                }else if(!openTag.equals(line.substring(startCloseTag + 2, endCloseTag))){
                    System.out.println("None");
                    end = endCloseTag + 1;
                }
            }
            testCases--;
        }
    }
}

