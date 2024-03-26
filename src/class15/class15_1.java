package class15;
import java.util.Scanner;
public class class15_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day of the week:");
        String day = sc.nextLine();

        switch (day){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println(day + " is a weekday");
                        break;
            case "Saturday":
            case "Sunday":
                System.out.println(day + "is a weekend day");
                break;
            default:
                System.out.println("Invalid day of the week");
        }
    }
}
