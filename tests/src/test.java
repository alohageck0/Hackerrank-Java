import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
        String tempStrin = "<a><b>dsfdsfds</b></a>";
//        System.out.println(tempStrin.substring(tempStrin.indexOf("</") + 2, tempStrin.indexOf('>')));
        Pattern p = Pattern.compile("<[A-za-z0-9]>+[A-za-z0-9 ]</[A-za-z0-9]>+");
        String regex = "(<[A-za-z0-9]>)+[A-za-z0-9 ](</[A-za-z0-9]>)+";
        System.out.println(tempStrin.matches(regex));
    }
}
