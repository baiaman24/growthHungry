package class20;

import java.util.Scanner;

public class class20_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input;
        while (true){
            System.out.println("Please enter a number: ");
            input = sc.nextInt();
            if (input > 0){
                System.out.println(input);
                break;
            } else {
                System.out.println("INvalid input message.");
            }
        }
    }
}
