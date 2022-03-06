package Lesson_2;

public class Exercise1 {
    public static void main(String[] args) {
        checkInterval(20, 0);
    }

    public static boolean checkInterval(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        }
        return false;
    }
}

