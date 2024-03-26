package class26_Map;

import java.util.*;
import java.util.Arrays;
public class class26_6 {
    public static void main(String[] args) {
        Map<String, List<String>> managersAndEmlpoyees = new HashMap<>();
        List<String> elonsEmployees = new ArrayList<>(Arrays.asList("Steve", "Brude", "Will", "Taco"));

        managersAndEmlpoyees.put("Elon", elonsEmployees);
        List<String> askarssEmployees = new ArrayList<>(Arrays.asList("Baia", "Bred", "Titi", "Tom"));

        managersAndEmlpoyees.put("Askar", askarssEmployees);
        System.out.println(managersAndEmlpoyees);
    }
}
