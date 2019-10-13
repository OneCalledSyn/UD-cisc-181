public static void main(String[] args) {
    int [] arr1 = {1, 3, 4, 8};
    int [] arr2 = {2, 5, 6, 7};
}

public static int[] AddArray(int[] arr1, int[] arr2) {
    int x = arr1.length;
    int y = arr2.length;
    int[] newarr = new int[x+y];

    for (int i = 0; 0 < arr1.length; i++) {
        newarr[i] = arr1[i];
        System.out.println(newarr[i]);
    }

    for (int i = 0; i < arr2.length; i++) {
        newarr[x+i] = arr2[i];
        System.out.println(newarr[x+i]);
    }

    System.out.println(newarr);
    return newarr;
}