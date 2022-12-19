import java.util.Arrays;

public class BubbleSort {

    public void sirala(int[] dizi) {

        for (int j = 0 ; j < dizi.length ; j++){
            for (int i = 0; i < dizi.length-1; i++) {
                if (dizi[i] > dizi[i + 1]) {
                    int gecici = dizi[i];
                    dizi[i] = dizi[i + 1];
                    dizi[i + 1] = gecici;
                }
            }
        }
    }
    public void yazdir(int[] dizi){
        System.out.println("Sıralandıktan sonra: "+Arrays.toString(dizi));
    }

}
