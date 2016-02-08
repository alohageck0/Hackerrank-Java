import java.util.*;

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
//            System.out.println(tempStrin.substring(tempStrin.indexOf('>') + 1));
            return findOpenTags(queue, tempStrin.substring(tempStrin.indexOf('>') + 1));
        }
        return queue;
    }

    public static String deleteOpenTags(Queue<String> tags, String strin) {
        String temp = strin;
        Queue<String> tempTags = tags;
        while (!tags.isEmpty()) {
//            strin.replaceFirst("<" + tags.remove() + ">", strin);
//            System.out.println(tempTags.peek());
            temp = temp.replaceAll("<" + tempTags.remove() + ">", "");
//            System.out.println(temp);
            return deleteOpenTags(tempTags, temp);
        }
        return temp;
    }

    public static Stack<String> findCloseTags(Stack<String> stack, String strin) {
        String tempStrin = strin;
        while (strin.length() != 0 && strin.charAt(strin.length() - 1) == '>') {
            stack.add(tempStrin.substring(tempStrin.indexOf("</") + 2, tempStrin.indexOf('>')));
            return findCloseTags(stack, tempStrin.substring(tempStrin.indexOf('>') + 1));
        }
        return stack;
    }

    public static String deleteCloseTags(Stack<String> tags, String strin) {
        String temp = strin;
        Stack<String> tempTags = tags;
        while (!tags.isEmpty()) {
            temp = temp.replaceAll("</" + tempTags.pop() + ">", "");
            return deleteCloseTags(tempTags, temp);
        }
        return temp;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();
            Queue<String> openTags = new LinkedList<>();
            Stack<String> closeTags = new Stack<>();
            findOpenTags(openTags, line);
            String test1 = deleteOpenTags(openTags, line);
            findCloseTags(closeTags, test1);
            String result = deleteCloseTags(closeTags, test1);
            if (tagsCorrect(openTags, closeTags)) {
                System.out.println(result);
            } else {
                System.out.println("None");
            }

            testCases--;
        }
    }
}
