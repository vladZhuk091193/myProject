package Lesson_2;

public class Exercise6 {
    public static void main(String[] args) {
        stillArray();
    }
    public static void stillArray() {
        int[] qwe = new int[100];
        for (int i = 0; i < qwe.length; i++) {
            qwe[i] = i + 1;
            System.out.print(" " + qwe[i]);
        }
    }
}
