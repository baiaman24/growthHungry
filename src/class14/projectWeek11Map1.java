package class14;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class projectWeek11Map1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Red");
        map1.put(2, "Green");
        map1.put(3, "Black");
        map1.put(4, "Purple");

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(4, "White");
        map2.put(5, "Blue");
        map2.put(6, "Orange");

        System.out.println(merge(map1, map2));

    }
    public static Map<Integer, String> merge(Map<Integer, String> map1, Map<Integer, String> map2) {
        map1.putAll(map2);

        return map1;
    }
}
