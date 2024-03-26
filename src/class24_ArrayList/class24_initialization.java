package class24_ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class class24_initialization {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1.add("Elon");
        System.out.println(list1);

        String[] str = {"elon"};
        System.out.println(Arrays.toString(str));

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Elon Musk");
        list2.add("Donald Trump");
        System.out.println(list2);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1522);
        list3.add(258);
        list3.add(5864);
        System.out.println(list3);
        System.out.println(list3.get(0) + " is first salary of " + list2.get(0));

        List<String> list4 = new ArrayList<>();
        list4.add("vse");
        list4.add("davai");
        System.out.println(list4);
    }
}
