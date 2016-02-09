import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {
    public static void main(String[] args) {
        String tempStrin = "<a><b>dsfdsfds</b></a>";
        String strin1 = "<a><b>dsfdsfds</b></a><c>dadasd</c>";
        System.out.println(tempStrin.matches("</.+><.+>"));
        System.out.println(strin1.matches("</a><c>"));
        Pattern p = Pattern.compile("</a><c>");//todo find regex for this case
        Matcher m = p.matcher(strin1);
        Matcher z = p.matcher(tempStrin);
        System.out.println(m.find());
        System.out.println(z.find());

    }
}
