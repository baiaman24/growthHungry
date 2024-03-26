package class21;

public class class21_1 {
    public static void main(String[] args) {
          int num = 5;
        if(num < 1) {
            System.out.println("Error! Number n can't be less than 1");
        } else {
            // Start counting down from num
            int counter = num;
            while(counter >= 1) {
                int counter2 = counter;
                // Inner loop for printing numbers
                while(counter2 >= 1) {
                    System.out.print(counter2 + " ");
                    counter2--;
                }
                // Move to the next line after each row is printed
                System.out.println();
                counter--;
            }
        }
    }
}
