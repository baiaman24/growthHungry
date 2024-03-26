package class14;

import java.util.*;

import static java.util.Arrays.asList;

public class projectWeek11Map3 {
    public static void main(String[] args) {

        List<String> employeeList = asList("Nitin Kumar Yadav", "Sudhir Rana", "Komal Sharawat", "Suman Lata", "Naresh Kumar", "Sohan Singh", "Vinod Kumar", "Baiaman", "Jigit", "Becky", "Meimanbek", "Almaz");

        System.out.println(addEmployeeId(employeeList));

    }

    public static Map<String, String> addEmployeeId(List<String> employeeList) {
        Map<String, String> newEmployeeMap = new LinkedHashMap<>();
        for (int i = 1; i < employeeList.size(); i++){
            String num = String.format("%04d",i);
            newEmployeeMap.put(num, employeeList.get(i));
        }


        return newEmployeeMap;
    }
}
