package class14;

import java.util.*;

public class countOfUniqueElements {
    public static void main(String[] args) {
//        bag= [“potato”, “tomato”, “potato”, “paprika”, “tomato”, “potato”]
//        return: potato: 3
//        tomato: 2
//        paprika: 1

        String[] array = new String[]{"bara", "bere", "bara", "bere", "bara", "bere", "bara", "bere", "tika", "taka"};
        Set<String> wordsSet = new HashSet<>(Arrays.asList(array));
        Map<String, Integer> wordsMap = new HashMap<>();

        for(String word: wordsSet){
            int repeatCounter = 0;
            for(String element: array){
                if(word.equals(element)){
                    repeatCounter++;
                }
            }
            wordsMap.put(word, repeatCounter);
        }
        System.out.println(wordsMap);

    }
}
