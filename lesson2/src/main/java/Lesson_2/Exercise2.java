package Lesson_2;

public class Exercise2 {
    public static void main(String[] args) {
        positiveOrNegative(-32);
    }
    public static void positiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
}
