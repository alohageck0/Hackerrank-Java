package _6kyu;

import static org.junit.Assert.*;

import org.junit.Test;

class Door {
    public static boolean isGoingUp = true;

    public static String run(String events) {
        isGoingUp = true;
        int currentPosition = 0;
        boolean isMoving = false;
        StringBuilder run = new StringBuilder();
        for (int i = 0; i < events.length(); i++) {
            System.out.println("Current i = " + i + " current position is " + currentPosition);
            if (currentPosition == 5 || currentPosition == 0) {
                isMoving = false;
            }
            char currentEvent = events.charAt(i);
            switch (currentEvent) {
                case '.':
                    if (isMoving) {
                        currentPosition = move(currentPosition);
                    }
                    break;
                case 'P':
                    isMoving = !isMoving;
                    if (isMoving) {
                        currentPosition = move(currentPosition);
                    }
                    break;
                case 'O':
                    isMoving = true;
                    isGoingUp = !isGoingUp;
                        currentPosition = move(currentPosition);
                    break;
            }

            System.out.println(String.valueOf(currentPosition));

            run.append(String.valueOf(currentPosition));
        }
        return run.toString();
    }

    private static int move(int currentPosition) {
        int newPosition = 0;
        if (isGoingUp) {
            newPosition = currentPosition + 1;
        } else {
            newPosition = currentPosition -1;
        }
        return newPosition;

    }

}
public class MainTest {
    @Test
    public void testNormalOperation() {
        test("should stay closed unless button is pressed (no buttonpresses)", "..........", "0000000000");
        test("should start opening on buttonpress", "P..", "123");
        test("should open completely and stay open", "P....", "12345");
    }

    @Test
    public void testPause() {
        test("should start opening and pause on second buttonpress", "P.P..", "12222");
    }

    @Test
    public void testObstacles() {
        test("should reverse while opening", "P.O....", "1210000");
    }

    @Test
    public void testExample() {
        test("should start opening and reverse when obstacle", "..P...O.....", "001234321000");
    }

    private void test(String description,String events,String result) {
        assertEquals(description,result,Door.run(events));
    }
}