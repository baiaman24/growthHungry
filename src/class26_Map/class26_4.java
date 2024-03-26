package class26_Map;

import java.util.HashMap;
import java.util.Map;

public class class26_4 {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Elon");
        students.put(2, "Steve");
        students.put(5, "Julia");
        students.put(6, "Saka");
        students.put(1, "Baiman");
        System.out.println(students.get(5));
    }
}
