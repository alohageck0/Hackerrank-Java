import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
        String line = "<h1><h2>Sanjay has no watch</h2></h1><par>So wait for a while</par>";
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
            }
        }
    }
//        if (line.substring(start + 1, end).charAt(0) != '/') {
//
//
//            if ()
//            System.out.println(line.substring(end+1,));
//        }



}
