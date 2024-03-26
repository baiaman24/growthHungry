package class24_ArrayList;
import java.util.ArrayList;
import java.util.List;
public class class24_practice {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("lambo");
        list1.add("Ferrari");
        list1.add("Bugatti");
        list1.add(1, "Lada");
        System.out.println(list1);


        List<Double> revenueList = new ArrayList<>();
        revenueList.add(5457.665);
        revenueList.add(64654.566);
        revenueList.add(1,46456.5);
        revenueList.add(1,654654.5);
        System.out.println(revenueList);

    }
}
