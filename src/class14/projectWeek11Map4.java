package class14;

import java.util.HashMap;
import java.util.Map;

public class projectWeek11Map4 {

        public static void main(String[] args) {

            Map<Integer, Double> numberMap = new HashMap<>();
            numberMap.put(0, 0.0);
            numberMap.put(1, null);
            numberMap.put(2, 2.0);
            numberMap.put(3, null);
            numberMap.put(4, 4.0);
            numberMap.put(5, 2.0);
            numberMap.put(6, 4.0);
            numberMap.put(null, 4.0);

            projectWeek11Map4 maps = new projectWeek11Map4();
            System.out.println(maps.removeNullValues(numberMap));

        }

        public Map<Integer, Double> removeNullValues(Map<Integer, Double> map) {
            Map<Integer, Double> filteredMap = new HashMap<>();
            for(Map.Entry <Integer, Double> entry : map.entrySet()){
                if (entry.getValue() == null){
                   continue;
                }
                filteredMap.put(entry.getKey(), entry.getValue());
            }
            return filteredMap;
        }
    }

