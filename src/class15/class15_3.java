package class15;

import java.util.Scanner;

public class class15_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day of the week (Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday):\nEnter the time of day (morning, afternoon, evening):");
        String day = sc.nextLine();
        String time = sc.nextLine();

        switch (time){
            case "morning":
                switch (day){
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        System.out.println("Good morning! It's " + day +"!");
                        break;
                    case "Saturday":
                    case "Sunday":
                        System.out.println("Good morning! It's the weekend!");
                        break;
                    default:
                        System.out.println("Invalid day of week");
                } break;
            case "afternoon":
                switch (day){
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        System.out.println("Good afternoon! It's " + day +"!");
                        break;
                    case "Saturday":
                    case "Sunday":
                        System.out.println("Good afternoon! It's the weekend!");
                        break;
                    default:
                        System.out.println("Invalid day of week");
                } break;
            case "evening":
                switch (day){
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        System.out.println("Good evening! It's " + day +"!");
                        break;
                    case "Saturday":
                    case "Sunday":
                        System.out.println("Good evening! It's the weekend!");
                        break;
                    default:
                        System.out.println("Invalid day of week");
                } break;
            default:
                System.out.println("Invalid time of day");
        }


    }
    public void takeMeToTheMoon(){
        System.out.println("you did it");
    }
}
