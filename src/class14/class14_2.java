package class14;

import java.util.Arrays;

public class class14_2 {
    public static void main(String[] args) {
        String input = "aaaabbbbccccdccccw      wwwdfeb adwwwwwwwww 12222 122222        12222222";
        input = input.trim();
        if (input.isEmpty()) {
            System.out.println("0");
        } else {
            StringBuilder input1 = new StringBuilder(input);
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {
                    if (i + 1 < input.length() && input.charAt(i + 1) == ' ') {
                        input1.delete(i,i+1);
                        i--;
                    }
                }

            }
            int wordCounter = 1;
            for (int i = 0 ; i < input1.length(); i++){
                if(input1.charAt(i) == ' '){
                    wordCounter++;
                }
            }
            System.out.println(wordCounter);
        }
    }
}


