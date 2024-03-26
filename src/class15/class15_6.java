package class15;

import java.util.Scanner;

public class class15_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Vehicle Fuel Type Advisor!\nEnter your vehicle type (Sedan, SUV, Truck, Motorcycle):");
        String vehicle = sc.nextLine();
        String habits;

        switch (vehicle) {
            case "Sedan":
                System.out.println("Enter your typical driving habits (City, Highway, Mixed):");
                habits = sc.nextLine();
                switch (habits) {
                    case "City":
                        System.out.println("Recommended Fuel Type: Electric");
                        break;
                    case "Highway":
                        System.out.println("Recommended Fuel Type: Diesel");
                        break;
                    case "Mixed":
                        System.out.println("Recommended Fuel Type: Petrol");
                        break;
                } break;
            case "SUV":
                System.out.println("Enter your typical driving habits (City, Highway, Mixed):");
                habits = sc.nextLine();
                switch (habits) {
                    case "City":
                        System.out.println("Recommended Fuel Type: Petrol");
                        break;
                    case "Highway":
                        System.out.println("Recommended Fuel Type: Diesel");
                        break;
                    case "Mixed":
                        System.out.println("Recommended Fuel Type: Hybrid");
                        break;

                }break;
            case "Truck":
                System.out.println("Recommended Fuel Type: Diesel");
                break;
            case "Motorcycle":
                System.out.println("Recommended Fuel Type: Petrol");

        }
    }
}
