package Lesson_2;

public class Exercise8 {
    public static void main(String[] args) {
        doubleArray();
    }

    public static void doubleArray(){
        int [][] array = new int[4][4];
        for (int i=0; i<array.length; i++){
            for(int j=0; j<array.length; j++){
                if (i == j || (i + j) == array.length - 1 ) {
                    array[i][j] = 1;
                }else {
                    array[i][j] = 0;
                }
            }
        }
    }
}

