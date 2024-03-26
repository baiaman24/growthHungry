package class14;

import java.util.Arrays;

public class classWork6 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{6, 5, 5, 6, 7};
        int[] nums2 = new int[]{1,23,3,4,5};

       System.out.println(Arrays.toString(findSmallestAbsoluteDifference(nums1, nums2)));


    }
    public static int[] findSmallestAbsoluteDifference(int[] array1, int[] array2){
        int[] resultArray = new int[2];// i declare a new array with the length of 2 to store 2 m numbers
        int minResult = Math.abs(array1[0]-array2[0]); // i initialized the first elements in both arrays as the minimum
        int index1 = 0; // at the i will need indexes of the numbers of min absolute diff, for now i initialized them as 0
        int index2 = 0; // in the process they will be updated if new min abs Diff. is found
        for(int i =0 ; i < array1.length; i++){   // i used nested loop, to looak at each and every number and check their abs.diff
            int firstNum = array1[i];
            for (int k = 0; k < array2.length; k++){
                int secondNum = array2[k];
               int result = Math.abs(firstNum-secondNum); // i store absolute num of the difference in result
               if(minResult >= result){ // then compare with the previously assigned min abs diff
                   minResult = result;// if it is smaller i reassign my min abs diff, and reassign indices
                   index1 = i;
                   index2 = k;
               }
            }
        }
        resultArray[0] = array1[index1]; // at the end i just add the numbers at the specified indices to my newly created array
        resultArray[1] = array2[index2];
        return  resultArray;
    }
}
