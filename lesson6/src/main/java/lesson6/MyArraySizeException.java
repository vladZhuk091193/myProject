package lesson6;

class MyArraySizeException extends RuntimeException {
    MyArraySizeException(String asd) {
        System.out.println("Массив неправильного размера.\n" + " " + asd);
    }
}
