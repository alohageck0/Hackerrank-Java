package DequeueTest;

import java.util.*;

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int subarrayLength = scanner.nextInt();
        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> uniqueNumbers = new HashSet<>(subarrayLength);
        Map<Integer, Integer> countNumbers = new HashMap<>(subarrayLength);
        int maxNumberUniqueInt = 0;


        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            Integer countVal;

            if (deque.size() == subarrayLength) {
                Integer numberHeadOfDeque = deque.remove();
                countVal = countNumbers.get(numberHeadOfDeque);
                countNumbers.put(numberHeadOfDeque, countVal - 1);
                if (countVal - 1 == 0) {
                    uniqueNumbers.remove(numberHeadOfDeque);
                }
            }

            deque.add(number);
            countVal = countNumbers.get(number);
            if (countVal == null) {
                countVal = 0;
            }
            countNumbers.put(number, countVal + 1);
            uniqueNumbers.add(number);

            if (deque.size() == subarrayLength) {
                maxNumberUniqueInt = Math.max(maxNumberUniqueInt, uniqueNumbers.size());
            }

        }

        System.out.println(maxNumberUniqueInt);
    }
}
