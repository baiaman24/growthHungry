package class14;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        // The Fibonacci sequence is defined as a sequence of numbers in which each number is the sum of the preceding two
// It is commonly started with 0, 1
// Please write some code that will print or return the fibonacci sequence, up to the nth number where n is passed in.
// ex 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 .....
// if n = 5, then result should be [0, 1, 1, 2, 3]
// if n = 3, then result should be [0, 1, 1]
// if n = 1, then result should be [0]
// if n = 8 then result should be [0, 1, 1, 2, 3, 5, 8, 13]
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any positive whole number bigger or equal to 2: ");
        int num = sc.nextInt();
        if(num <= 1 ){
            System.out.println("Invalid number!");
        }
        else{
            List<Integer> numbersList = new ArrayList<>();
            int num1 = 0;
            int num2= 1;
            numbersList.add(num1);
            numbersList.add(num2);
            for(int i = 0; i < num-2; i++){
                int result = num1 +num2;
                numbersList.add(result);
                num1 = num2;
                num2 = result;

            }
            System.out.println(numbersList);

        }


    }
}
