package class14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class classWorkweek12 {
    /**
     * 1)Create a function so that it doubles items in the list
     * Call this function and print them out
     * ex:
     * if the parameter is
     * (1,5,3,7)
     * return
     * [1, 1, 5, 5, 3, 3, 7, 7]
     *
     * 2)Create another function so that it retrieves two middle items from the doubled list
     * Call this function and print them out
     * ex:
     * return
     * [5, 3]
     */
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,5,3,7);
        List<Integer> updated = classWorkweek12.doubleItAndGetMiddle(nums);
        System.out.println(updated);

        System.out.println(classWorkweek12.retrieveMiddleObjects(updated));


    }
    public static List<Integer> doubleItAndGetMiddle(List<Integer> nums){
        List<Integer> updatedList = new ArrayList<>();
        for(Integer num : nums){
            updatedList.add(num);
            updatedList.add(num);

        }
        return updatedList;
    }
    public static List<Integer> retrieveMiddleObjects(List<Integer> nums){
        List<Integer> updated = new ArrayList<>();
        int num1 = nums.get(nums.size()/2-1);
        int num2 = nums.get(nums.size()/2);
        updated.add(num1);
        updated.add(num2);
        return updated;
    }
}
