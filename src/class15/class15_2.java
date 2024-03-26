package class15;

import java.util.Scanner;

public class class15_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Linux Command:");
        String command = sc.nextLine();

        switch (command){
            case "cd":
            case "pwd":
                System.out.println(command + " is a navigation command");
                break;
            case "ls":
            case "cp":
            case "mv":
            case "mkdir":
                System.out.println(command + " is a file management command");
                break;
            case "shutdown":
            case "restart":
                System.out.println(command + " is a system management command");
                break;
            default:
                System.out.println("Invalid command. Please enter a valid command");
        }
    }
}
