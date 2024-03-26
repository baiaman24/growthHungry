package class19;

import java.util.Scanner;

public class class19_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username;
        String password;

        do{
            System.out.println("Please enter your username and password:");
            username = sc.nextLine();
            password = sc.nextLine();

            if (username.equals("baiaman.t@gmail.com") && password.equals("031275bb$")){
                System.out.println("Welcome " + username);
            } else {
                System.out.println("Invalid credentials.");
            }

        } while (!username.equals("baiaman.t@gmail.com") || !password.equals("031275bb$"));

    }
}
