import java.sql.Array;

public class Sort {

    void countingSort(int dizi[], int boyut, int konum) {
        int[] output = new int[boyut + 1];
        int max = dizi[0];
        for (int i = 1; i < boyut; i++) {
            if (dizi[i] > max)
                max = dizi[i];
        }
        int[] count = new int[max + 1];

        for (int i = 0; i < max; ++i){
            count[i] = 0;
        }


        for (int i = 0; i < boyut; i++){
            count[(dizi[i] / konum) % 10]++;
        }


        for (int i = 1; i < 10; i++){
            count[i] += count[i - 1];
        }


        for (int i = boyut - 1; i >= 0; i--) {
            output[count[(dizi[i] / konum) % 10] - 1] = dizi[i];
            count[(dizi[i] / konum) % 10]--;
        }

        for (int i = 0; i < boyut; i++)
            dizi[i] = output[i];
    }

    int getMax(int array[], int n) {
        int max = array[0];
        for (int i = 1; i < n; i++)
            if (array[i] > max)
                max = array[i];
        return max;
    }

    void radixSort(int dizi[], int boyut) {
        int max = getMax(dizi, boyut);

        for (int konum = 1; max / konum > 0; konum *= 10)
            countingSort(dizi, boyut, konum);
    }
}
