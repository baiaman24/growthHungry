package class14;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class class14_3 {
    public static void main(String[] args) {
        Set<Integer> set= new HashSet<>(Arrays.asList(1,2,5,36,4,8,9));
        System.out.println(set.size());
        Integer max = 0;
        for(Integer element: set){
            max = Math.max(max, element);
        }
        System.out.println(max);
    }
}
