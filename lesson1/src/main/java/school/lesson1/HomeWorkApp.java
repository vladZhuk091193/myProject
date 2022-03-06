package school.lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {

    }

    // Упражнение 2.
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // Упражнение 3.
    public static void checkSumSign() {
        int a = 5;
        int b =-51;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        }else{
            System.out.println("Cумма отрицательная");
        }
    }

    // Упражнение 4.
    public static void printColor() {
        int value = 0;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    // Упражнение 5.
    public static void compareNumbers() {
        int a = 32;
        int b = 213;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}

