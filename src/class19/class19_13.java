package class19;

import java.util.Scanner;

public class class19_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = "";
        String password = "";
        while (!username.equals("baiaman.t@gmail.com") || !password.equals("031275bb$")){
            System.out.println("Enter your password and username:");
            username = sc.nextLine();
            password = sc.nextLine();
            if (!username.equals("baiaman.t@gmail.com") || !password.equals("031275bb$")){
                System.out.println("Invalid answer");
            }
        }
        System.out.println("Welcome " + username);
    }
}
