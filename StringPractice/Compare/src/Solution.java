import java.util.*;

public class Solution {


    private static ArrayList<String> createList(String string, int substr) {
        ArrayList<String> array = new ArrayList<>();
        int i = 0;
        while (i <= string.length() - substr) {
            array.add(string.substring(i, i + substr));
            i++;
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> test = createList(sc.next(), sc.nextInt());
        Collections.sort(test);
        System.out.println(test.get(0));
        System.out.println(test.get(test.size()-1));
    }
}
