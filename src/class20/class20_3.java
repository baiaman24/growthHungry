package class20;

import java.util.Scanner;

public class class20_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int counter = 1;
        while (counter <= input) {
            if (counter % 2 != 0) {
                counter++;
                continue;
            }
        System.out.println(counter);
        counter++;
    }

        String str = "Hello future SdET superstar";
        int counter1 = 0;

        while(counter1 <= str.length()-1){
            if(str.charAt(counter1) == ' '){
                counter1++;
                continue;
            }
            System.out.println(str.charAt(counter1));
            counter1++;
        }

        }
    }

