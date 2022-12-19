import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] dizi = {3,5,1,8,6,12};
        System.out.println("Sıralanmadan önce: "+Arrays.toString(dizi));
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sirala(dizi);
        bubbleSort.yazdir(dizi);

    }
}
