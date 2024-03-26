package class14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class classwork1 {
    public static void main(String[] args) {
        List<Integer> in = new ArrayList<>(Arrays.asList(5, 5, 48, 7, 892, 62, 5, 3, 2, 1, 5, 4, 4, 5, 8));
        System.out.println(findNeededNums(in, 10));
    }

    public static List<Integer> findNeededNums(List<Integer> input, int targetSum) {
        List<Integer> targetList = new ArrayList<>(); // List for storing two numbers


        for (int k = 0; k < input.size(); k++) {

            for (int i = k + 1; i < input.size(); i++) {
                int firstNum = input.get(k);
                int secondNum = input.get(i);

                if (firstNum + secondNum == targetSum) {
                    targetList.add(firstNum);
                    targetList.add(secondNum);
                    return targetList;
                }
            }
        }


        if (targetList.isEmpty()) {
            System.out.println("Target numbers were not found");
        }

        return targetList;
    }
}
