import java.util.Arrays;

public class InsertionSort {

    public void sirala(int[] dizi) {
        for (int j = 0; j < dizi.length; j++) {
            for (int i = 1; i < dizi.length; i++) {
                if (dizi[i - 1] > dizi[i]) {
                    int gecici =dizi[i-1];
                    dizi[i-1] = dizi[i];
                    dizi[i]=gecici;
                }
            }
        }
    }

    public void yazdir(int[] dizi) {
        System.out.println("Sıralandıktan sonra: " + Arrays.toString(dizi));
    }
}
