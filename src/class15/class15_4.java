package class15;

import java.util.Scanner;

public class class15_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a computer component (CPU, GPU, RAM, storage):\nEnter a computer type (desktop, laptop):");
        String component = sc.nextLine();
        String type = sc.nextLine();

        switch (type){
            case "desktop":
                switch (component){
                    case "CPU":
                        System.out.println("The AMD Ryzen 9 5950X is a popular CPU choice for high-performance desktops");
                        break;
                    case "GPU":
                        System.out.println("The NVIDIA GeForce RTX 3090 is a popular GPU choice for high-performance desktops");
                        break;
                    case "RAM":
                        System.out.println("The G.SKILL Trident Z RGB is a popular RAM choice for high-performance desktops");
                        break;
                    case "Storage":
                        System.out.println("The Samsung 970 EVO Plus is a popular storage choice for high-performance desktops");
                        break;
                    default:
                        System.out.println("Invalid computer component");
                } break;
            case "laptop":
                switch (component){
                    case "CPU":
                        System.out.println("The Intel Core i7 is a popular CPU choice for high-performance laptops");
                        break;
                    case "GPU":
                        System.out.println("The NVIDIA GeForce RTX 3080 is a popular GPU choice for high-performance laptops");
                        break;
                    case "RAM":
                        System.out.println("The Corsair Vengeance SODIMM is a popular RAM choice for high-performance laptops");
                        break;
                    case "Storage":
                        System.out.println("The Western Digital Black SN750 is a popular storage choice for high-performance laptops");
                        break;
                    default:
                        System.out.println("Invalid computer component");
                } break;
            default:
                System.out.println("Invalid computer type");


        }
    }
}
