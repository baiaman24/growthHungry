package class19;

public class class19_3 {
    public static void main(String[] args) {
        String planet1 = "Mercury";
        String planet2 = "Venus";
        String planet3 = "Earth";
        String planet4 = "Mars";
        String planet5 = "Jupiter";
        String planet6 = "Saturn";
        String planet7 = "Uranus";
        String planet8 = "Neptune";

        int num1 = 0;
        while(num1 <= planet1.length()){
            System.out.println(planet1.charAt(num1));
            num1++;
            if (num1 == planet1.length()){
                System.out.println("=========");
            }
        }
        num1 = 0;
        while(num1 <= planet2.length()){
            System.out.println(planet2.charAt(num1));
            num1++;
            if (num1 == planet2.length()){
                System.out.println("=========");
            }
        }

    }
}
