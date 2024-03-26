package class25_Set;

import java.util.HashSet;
import java.util.Set;

public class class25_AddMethods {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Elon");
        names.add("Steve");
        names.add("Kesha");
        names.add("Baia");
        System.out.println(names);
        names.remove("Steve");
        boolean isTHere = names.remove("Steve");
        System.out.println(names);
        System.out.println(isTHere);
        String str = "Salam Aleikum";
        System.out.println(str.replace('a', 'o'));
    }
}
