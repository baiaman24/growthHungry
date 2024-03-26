package class19;

public class class19_10 {
    public static void main(String[] args) {
        int counter  = 1;

        do {
            System.out.println(counter);
            counter++;
        } while (counter <= 5);


        int counter1 = 11;

        do {
            System.out.println(counter1);
            counter1--;
        } while (counter1 >= -2);

        String word = "Salam aleikum";
        int counter2 = 0;

        do {
            System.out.println(word.charAt(counter2++));
        } while (counter2 <= word.length()-1);
    }
}
