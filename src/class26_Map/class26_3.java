package class26_Map;

import java.util.HashMap;
import java.util.Map;

public class class26_3 {
    public static void main(String[] args) {
        int input = -20;
        Map<Integer, Boolean> primeNumbers = new HashMap<>();
        if (input < 0) {
            for (int i = input; -1 >= input; input++) {
                int divisionCounter = 0;
                for (int k = -2; k >= i; k--) {
                    if (i % k == 0) divisionCounter++;
                }
                boolean isPrime = divisionCounter == 2;
                primeNumbers.put(i, isPrime);
            }
            System.out.println(primeNumbers);
        }
    }
}


