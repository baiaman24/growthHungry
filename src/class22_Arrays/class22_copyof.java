package class22_Arrays;

import java.util.Arrays;

public class class22_copyof {
    public static void main(String[] args) {
        int[] nums ={54654,6554,5453,5435,1215};
        int[] nums1= Arrays.copyOf(nums,4);
        System.out.println(Arrays.toString(nums1));
        String[] fruits = {"banana", "apple", "sugar","cherries"};
        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));
        int[] array = new int[6];
        Arrays.fill(array, 10);
        System.out.println(Arrays.toString(array));
        boolean areEqual = Arrays.equals(nums,array);
        System.out.println(areEqual);
        String[] fruits1 = {"banana", "apple", "sugar","cherries"};
        Arrays.sort(fruits1);
        boolean areEqual1 = Arrays.equals(fruits, fruits1);
        System.out.println(areEqual1);
    }
}
