import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
        String tempStrin = "<h1><h2>Sanjay has no watch</h2></h1><par>So wait for a while</par>";
        String regex = "<.+>+.+</.+>+"; // to split miltiple strings
        Pattern pattern = Pattern.compile(regex);
        System.out.println(tempStrin.matches(regex));
        Matcher m = pattern.matcher(tempStrin);
//        System.out.println(m.group());
        System.out.println(tempStrin.matches("<(.+)>+.+(</\1>)+"));
//        <(.+)>+.+</\1>+ regex for condition
//        <\/?.+> to tokenize
//        String result = tempStrin.replaceAll("</?.+>", "");
    }
}
