import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        QuickSortSiralama quickSortSiralama = new QuickSortSiralama();
        int[] array = {5, 6, 0, 7, 4, 8};
        quickSortSiralama.quickSort(array,0, array.length-1);
        System.out.println("Sorted: "+ Arrays.toString(array));
    }
}
