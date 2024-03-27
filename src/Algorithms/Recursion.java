package Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(factorial(n));
        System.out.println(Arrays.toString(fibonacci(n)));
        System.out.println(fibonacciRecursion(n));
    }
    public static int factorial(int n){
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public static int[] fibonacci(int n){
        int [] fibonacciNums = new int[n];
        if (n >= 1) {
            fibonacciNums[0] = 0;
        }
        if (n >= 2) {
            fibonacciNums[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            fibonacciNums[i] = fibonacciNums[i - 1] + fibonacciNums[i - 2];
        }

            return fibonacciNums;

    }
    public static int fibonacciRecursion(int n) {
        if (n <=1) {
            return n;
        } else {
            return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
        }
    }
}
