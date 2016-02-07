import java.util.*;
import java.util.regex.Pattern;

//<h1>Nayeem loves counseling</h1>
//(<[a-zA-Z ]+(\d)?>)
public class Solution {
    private static boolean tagsCorrect(Queue<String> openTagsQueue, Stack<String> closeTagsStack) {
        while (!openTagsQueue.isEmpty()) {
            if (!openTagsQueue.remove().equals(closeTagsStack.pop())) {
                return false;
            }
        }
        return true;
    }

    public static Queue<String> findOpenTags(Queue<String> queue, String strin) {
        String tempStrin = strin;
        while (strin.charAt(0) == '<') {
            queue.add(tempStrin.substring(1, tempStrin.indexOf('>')));
            return findOpenTags(queue, tempStrin.substring(tempStrin.indexOf('>')));
        }
        return queue;
    }

    public static Stack<String> findCloseTags(Stack<String> stack, String strin) {
        String tempStrin = strin;
        while (strin.charAt(strin.length() - 1) == '>') {
            stack.add(tempStrin.substring(tempStrin.indexOf("<") + 1, tempStrin.indexOf('>')));
            return findCloseTags(stack, tempStrin.substring(tempStrin.indexOf('>')));
        }
        return stack;
    }

    public static String deleteOpenTags(Queue<String> tags, String strin) {
        while (!tags.isEmpty()) {
            strin.replaceFirst("<" + tags.remove() + ">", strin);
            return deleteOpenTags(tags, strin);
        }
        return strin;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();

            Queue<String> openTags = new LinkedList<>();
            Stack<String> closeTags = new Stack<>();

            if (tagsCorrect(openTags, closeTags)) {
//                printLineWithouTags();
            } else {
                System.out.println("None");
            }
        }

        testCases--;
    }


}
