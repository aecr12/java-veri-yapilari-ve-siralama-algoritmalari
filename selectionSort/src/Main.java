import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] dizi = {5, 1, 7, 10, 25, 0, 2};
        System.out.println("Sıralanmadan önce: "+ Arrays.toString(dizi));
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sirala(dizi);
        selectionSort.yazdir(dizi);
    }
}
