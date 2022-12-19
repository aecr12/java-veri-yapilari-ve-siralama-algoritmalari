import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] dizi = {236, 327, 111, 560, 654, 1102};

        Sort sort = new Sort();
        sort.radixSort(dizi, dizi.length);
        System.out.println("Sorted: ");
        System.out.println(Arrays.toString(dizi));
    }
}
