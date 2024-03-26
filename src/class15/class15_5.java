package class15;

import java.util.Scanner;

public class class15_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cuisine = sc.nextLine();
        String meat = sc.nextLine();

        switch(meat){
            case "Vegetarian":
        switch (cuisine) {
            case "Italian":
                System.out.println("Tomatoes, Basil, Mozzarella, Olive Oil, Pasta");
                break;
            case "Mexican":
                System.out.println("Beans, Tomatoes, Avocado, Corn, Tortillas");
                break;
            case "Indian":
                System.out.println("Lentils, Rice, Spinach, Spices, Naan");
        } break;
            case "Non-vegetarian":
                switch (cuisine) {
                    case "Italian":
                        System.out.println("Beef, Tomatoes, Garlic, Parmesan, Pasta");
                        break;
                    case "Mexican":
                        System.out.println("Chicken, Beef, Beans, Salsa, Tortillas");
                        break;
                    case "Indian":
                        System.out.println("Chicken, Lamb, Rice, Curry, Naan");
                }
        }
    }
}
