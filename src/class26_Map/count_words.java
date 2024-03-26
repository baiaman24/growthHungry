package class26_Map;

import java.util.*;

public class count_words {
    public static void main(String[] args) {
        String text = "hello world hello askar askar askar Adina hello hello";
        String[] array = text.split("\\s+");
        Map<String, Integer> wordRepetitionCounter = new HashMap<>();
        for(String element : array){
            int repetition = 0;

            if(wordRepetitionCounter.containsKey(element)){
                repetition = wordRepetitionCounter.get(element) ;
            }

            wordRepetitionCounter.put(element,repetition+1);

        }
        System.out.println(wordRepetitionCounter);

    }
}
