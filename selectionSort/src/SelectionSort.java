import java.util.Arrays;

public class SelectionSort {

    public void sirala(int[] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            int enkucuk = i;
            for (int j = i + 1; j < dizi.length; j++) {

                if (dizi[j] < dizi[enkucuk]) {
                    enkucuk = j;
                }
            }
            if(enkucuk != i){
                int gecici = dizi[enkucuk];
                dizi[enkucuk] = dizi[i];
                dizi[i] = gecici;
            }
        }
    }

    public void yazdir(int[] dizi) {
        System.out.println("Sıralandıktan sonra: " + Arrays.toString(dizi));
    }
}
