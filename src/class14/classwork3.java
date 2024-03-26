package class14;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.sort;

public class classwork3 {
    public static void main(String[] args) {
        List<Integer> array1 = Arrays.asList(2, 87, 5, 8);
        List<Integer> array2 = Arrays.asList(2,87,8,5);
        System.out.println("Is the second array subsequent of the first one: " + isItAdjacent(array1, array2));

    }

    public static boolean isItAdjacent(List<Integer> array1, List<Integer> array2) {
        if (!array1.containsAll(array2)){ // first of all i check whether array1 contains array2, it does not make sense to continue if it doesn't contain it
            return false;
        }
         else{
             int index1 = -1;// i am doing because it makes it possible for me to make comparison and reassign the value
            for(int i = 0; i < array2.size(); i++){ // i loop through the arraylist2 because i need to find whether its elements are given in order in arraylist2
                int index2 = array1.indexOf(array2.get(i));//here i declare variable index2 to get the index of the element of the arraylist2 within arraylist1
                if(index1 < index2){// the logic behind this condition is that the index of the first found element will be always bigger than -1
                    index1 = index2;// then we will reassign it to index1 . So, if the elements are given in order it will keep reassigning
                    // it until the loop finishes and will return true at the end, if the order is not the same so, index1 will be assigned a bigger number than index2
                    // which means arraylist is not adjacent and we will return false;
                }
                else{
                    return false;
                }

                }
            return true;
            }

        }
    }





