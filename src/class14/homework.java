package class14;

import java.util.Arrays;


public class homework {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(Arrays.toString(rotateElements(array, 1)));
    }

    public static int[] rotateElements(int[] array, int numberOfPositions) {
        int length = array.length;
        int[] updatedArray = new int[length];

        for (int i = 0; i < length; i++) {

            int newPosition = (i + length - numberOfPositions) % length;
            updatedArray[newPosition] = array[i];
        }

            return updatedArray;
        }
    }

/*
Given an array of numbers {1, 2, 3, 4, 5, 6, 7},
rotate 2 (or n) positions to the left to print out this output: {3,4,5,6,7,1,2}
 */