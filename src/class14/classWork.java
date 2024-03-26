package class14;
import java.util.Scanner;
public class classWork {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.println("Welcome to the Vehicle Fuel Type Advisor!\nEnter your vehicle type (Sedan, SUV, Truck, Motorcycle):");
                String vehicle = sc.nextLine();
                String recommendation = "";

                switch (vehicle) {
                    case "Truck":
                        recommendation = "Diesel";
                        break;
                    case "Motorcycle":
                        recommendation = "Petrol";
                        break;
                    case "Sedan":
                    case "SUV":
                        System.out.println("Enter your typical driving habits (City, Highway, Mixed):");
                        String habits = sc.nextLine();
                        switch (habits) {
                            case "City":
                                recommendation = vehicle.equals("Sedan") ? "Electric" : "Petrol";
                                break;
                            case "Highway":
                                recommendation = "Diesel";
                                break;
                            case "Mixed":
                                recommendation = vehicle.equals("Sedan") ? "Petrol" : "Hybrid";

                        }


                }
                System.out.println("Recommended fuel type " + recommendation);

            }
        }

