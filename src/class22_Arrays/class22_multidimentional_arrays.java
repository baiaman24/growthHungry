package class22_Arrays;

import java.util.Arrays;

public class class22_multidimentional_arrays {
    public static void main(String[] args) {
        int[][] arr2d = new int[3][2];
        System.out.println(Arrays.deepToString(arr2d));
        arr2d[1][1] =5;
        System.out.println(Arrays.deepToString(arr2d));
        int num = arr2d.length;
        System.out.println(num);
    }
}

