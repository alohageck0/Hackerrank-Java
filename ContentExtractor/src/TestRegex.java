import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {
    public static void main(String[] args) {
        String strin1 = "<a><b>dsfdsfds</b></adas><cdsad>dadasd</c>";
        String tempStrin = "<a><b>dsfdsfds</b></a>";
//        System.out.println(tempStrin.matches("</.+><.+>"));
//        System.out.println(strin1.matches("</a><c>"));
        String regex = "</.+><[^/].+>"; //gotcha!
        Pattern p = Pattern.compile(regex);//todo find regex for this case
        Matcher m = p.matcher(strin1);
        Matcher z = p.matcher(tempStrin);
        System.out.println(m.find());
        System.out.println(z.find());

    }
}
