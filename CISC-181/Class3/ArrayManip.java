import java.util.Arrays;

public class ArrayManip {
    public static void main (String[] args) {
        int [] k = {3,2,5,7};
        int [] m = {8,6,4,9};
        int [] x = f1(k,m);
        System.out.println(Arrays.toString(x));
        int n[] = {3,7,12,18,27,47,52};
        int[] y = f2(n,42);
        System.out.println(Arrays.toString(y));
    }

    public static int[] f1(int[] arr1, int[] arr2) {
        int x = arr1.length;
        int[] newarr = new int[x*2];
        for (int i = 0; i < arr1.length; i++) {
            newarr[i*2] = arr1[i];
            newarr[i*2 + 1] = arr2[i];
        }
        return newarr;
    }

    public static int[] f2(int[] arr1, int x) {
        int y = arr1.length;
        int [] newarr = new int[y+1];
        int a = 0;
        for(int i = 0; i < arr1.length; i++) {
            if ((arr1[i] > x) && (a == 0)) {
                newarr[i] = x;
                a = 1;
            }
            newarr[i+a] = arr1[i];
        }
        return newarr;
    }
}