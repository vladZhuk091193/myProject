package Lesson_2;

public class Exercise4_1 {
    public static void main(String[] args) {
        successfulOrUnsuccessful(100);
    }

    public static boolean successfulOrUnsuccessful(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        }
        return false;
    }
}

