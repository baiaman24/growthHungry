package class14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class classwork4 {
    public static void main(String[] args) {
        List<Integer> in = new ArrayList<>(Arrays.asList(5, 5, 48, 7, 892, 62, 5,3,2,1,5,4,4,5,8));
        System.out.println(findNeededNums(in,55));
    }

    public static List<Integer> findNeededNums(List<Integer> input, int targetSum) {
        List<Integer> targetList = new ArrayList<>(); // it is list for storing two new numbers
        int  k = 0; // index for the firstNum
        for (int i = 1; i < input.size(); i++) { // it starts from index 0
            int firstNum = input.get(k);
            int secondNum = input.get(i);
            if(firstNum+secondNum == targetSum){  // this condition checks whether we have found nums, if yes it will stop the loop
                targetList.add(firstNum);
                targetList.add(secondNum);
                break;
            }
           if (targetList.isEmpty() && k != input.size()-1 && input.size()-1 == i){  // so this condition is needed to change the firstNum to the next element in the loop,
               k++; // it will change until gets to the last element k != input.size()-1
               i= k+1; // of course the secondNum will start from the next element
           }

        }
        if (targetList.isEmpty()) { // if no nums were found empty list will be returned automatically, but i also decided to add clarification message
            System.out.println("Target numbers were not found");
        }
            return targetList;
        }
    }

