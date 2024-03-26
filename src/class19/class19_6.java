package class19;

import java.util.Scanner;

public class class19_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to see that again? Yes or No");
        String answer = sc.nextLine();

        while (answer.equalsIgnoreCase("yes")){
            System.out.println("Happy New YEar");
            System.out.println("Do you want to see that again? Yes or No");
            answer = sc.nextLine();
        }
    }
}
