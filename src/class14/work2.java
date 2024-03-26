package class14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class work2 {
    public static void main(String[] args) {
        List<Integer> in = new ArrayList<>(Arrays.asList(5,5,4,6,78,6,4,5,4,8,5,7,5,6));
        System.out.println( findNeededNums(in, 83));
    }

    public static List<Integer> findNeededNums(List<Integer> input, int targetSum) {
        List<Integer> targetList = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {
            int num1 = input.get(i);
            for (int k = i + 1; k < input.size(); k++) {
                int num2 = input.get(k);
                if (targetSum == num1 + num2) {
                    targetList.add(num1);
                    targetList.add(num2);
                    return targetList;
                }
            }
        }
        return targetList;
    }
}
