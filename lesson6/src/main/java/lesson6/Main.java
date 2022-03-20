package lesson6;

import static java.lang.Integer.valueOf;

public class Main {
    public static void main(String[] args) {
        String[][] array1 = new String[][]{
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "a", "1", "1"},
                {"1", "1", "1", "1"}
        };
        String[][] array2 = new String[][]{
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "10", "4"},
                {"1", "2", "3", "4"}
        };
        String[][] array3 = new String[][]{
                {"1", "6"},
                {"1", "7", "7"},
                {"1", "8", "3", "8"},
                {"1", "9", "3", "9"}
        };
        try {
            System.out.println("Сумма всех элементов массива равна " + convertAndSum(array1));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
        try {
            System.out.println("Сумма всех элементов массива равна " + convertAndSum(array2));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
        try {
            System.out.println("Сумма всех элементов массива равна " + convertAndSum(array3));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }

    }
    private static int convertAndSum(String[][] asd) throws MyArraySizeException, MyArrayDataException {
        int arr = 4;
        int sum = 0;

        if (asd.length != 4) {
            throw new MyArraySizeException(String.format("Размерность массива должен быть " + arr + "x" + arr));
        }
        for (int i = 0; i < asd.length; i++) {
            if (asd[i].length != 4) {
                throw new MyArraySizeException(String.format("Размерность массива должен быть " + arr + "x" + arr));
            }
        }
        for (int i = 0; i < asd.length; i++) {
            for (int j = 0; j < asd[i].length; j++) {
                try {
                    sum += valueOf(asd[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("В массиве находится не целое число"));
                }
            }
        }
        return sum;
    }
}





