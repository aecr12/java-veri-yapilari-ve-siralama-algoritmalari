import java.util.Arrays;

public class ShellSort {

    public int shellSortSiralama(int[] dizi){
        int boyut = dizi.length;
        for (int gap = boyut/2 ; gap>0 ; gap/=2){
            for(int i = gap ; i<boyut ; i+=1){
                int gecici = dizi[i];

                int j;
                for (j=i ; j>=gap && dizi[j-gap]>gecici ; j-=gap){
                    dizi[j] = dizi[j-gap];
                }
                dizi[j] = gecici;
            }
        }
        System.out.println("Siralanmis dizi: "+Arrays.toString(dizi));
        return 0;
    }
}
