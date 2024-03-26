package class25_Set;
import java.util.*;

public class class25_SetCollections {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();


        names.add("beka");
        names.add("taka");
        names.add("seka");
        names.add("naomi");
        names.add("neomi");
        names.add("beka");

        Set<String> neamesSet = new HashSet<>(names);
        Set<String> namesSet1 = new TreeSet<>(names);
        Set<String> namesSet2 = new LinkedHashSet<>(names);

        System.out.println(names);
        System.out.println(neamesSet);
        System.out.println(namesSet1);
        System.out.println(namesSet2);

    }
}
