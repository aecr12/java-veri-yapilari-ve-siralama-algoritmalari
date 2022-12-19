import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] dizi = {3, 1, 5, 7, 0, 15, 63, -8};
        System.out.println("Sıralanmadan oncec: "+ Arrays.toString(dizi));
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sirala(dizi);
        insertionSort.yazdir(dizi);
    }
}
