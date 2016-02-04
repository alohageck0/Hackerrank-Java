import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class myRegex {
    String pattern = "(([0-1]?\\d{1,2}|2[0-4][0-9]|25[0-5])\\.){3}([0-1]?\\d{1,2}|2[0-4][0-9]|25[0-5])";
//    (([0-1]?\d{1,2}|2[0-4][0-9]|25[0-5])\.){3}([0-1]?\d{1,2}|2[0-4][0-9]|25[0-5])
    public myRegex() {

    }
}

class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new myRegex().pattern));
        }

    }
}