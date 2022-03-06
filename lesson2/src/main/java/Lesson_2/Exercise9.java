package Lesson_2;

public class Exercise9 {
    public static void main(String[] args) {
        twoArgument(4,2);
    }
    public static void twoArgument(int len, int initialValue){
        int[] mus = new int[len];
        for(int i=0; i<len; i++){
            mus[i]=initialValue;
            System.out.println("в ячейке [" + i + "] находится число " + mus[i] + " ");
        }
    }
}

