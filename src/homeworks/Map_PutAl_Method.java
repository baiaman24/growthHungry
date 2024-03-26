package homeworks;

import java.util.*;
import java.util.List;

public class Map_PutAl_Method {
    public static void main(String[] args) {
       Map<String, List<Integer>> unsortedMap = new HashMap<>();
       List<Integer> numsList = new ArrayList<>(Arrays.asList(5,6,4,7,51,63,43,3));
       Collections.sort(numsList);
       System.out.println(numsList);

    }
}
