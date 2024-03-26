package class19;

import java.util.Scanner;

public class class19_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to register new USer?");
        String answer = sc.nextLine();
        int counter = 0;
        while (answer.equalsIgnoreCase("yes")){
            counter++;
            System.out.println("Do you want to register new USer?");
            answer = sc.nextLine();
        } System.out.println(counter);
    }

}
