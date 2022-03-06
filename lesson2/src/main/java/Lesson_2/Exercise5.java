package Lesson_2;

public class Exercise5 {
    public static void main(String[] args) {
        theFirstArray();
    }

    public static void theFirstArray() {
        int[] array = {0, 1, 1, 0, 0, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
    }
}

