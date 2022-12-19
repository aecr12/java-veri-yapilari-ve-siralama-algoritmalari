import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] dizi = {3,8,5,4,0,7,2};
        System.out.println("Siralanmadan once: "+Arrays.toString(dizi));
        ShellSort shellSort = new ShellSort();
	    shellSort.shellSortSiralama(dizi);


    }
}
