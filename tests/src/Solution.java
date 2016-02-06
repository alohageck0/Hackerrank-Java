import java.util.*;

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
            System.out.println(tempStrin.substring(tempStrin.indexOf('>')+1));
            return findOpenTags(queue, tempStrin.substring(tempStrin.indexOf('>')+1));
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

    public static void main(String[] args) {
        Queue<String> openTags = new LinkedList<>();
        Stack<String> closeTags = new Stack<>();
        String test = "<a><b>dsfdsfds</b></a>";

        findOpenTags(openTags, test);
        while (!openTags.isEmpty()) {
            System.out.println(openTags.remove());
        }
    }
}
