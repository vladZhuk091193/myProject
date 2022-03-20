package lesson5;

public class Exercise1 {
    public void changePlace ( int[] arr,  int i, int j) {
        int tmp = arr[1];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
