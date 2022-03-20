package lesson6;

class MyArrayDataException extends RuntimeException {
    MyArrayDataException(String asd) {
        System.out.println("В ячейке массива должно лежать целое число.\n" + " " + asd);
    }
}