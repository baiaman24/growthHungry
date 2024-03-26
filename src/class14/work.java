package class14;

public class work {
    public static void main(String[] args) {
      System.out.println(calculatePrimeNumbersInRange(10, 20));

    }
    public static int calculatePrimeNumbersInRange(int start, int end){
        int sum = 0;
        int count;
        for (int i = start; i <= end; i++) {
            count = 0;
            for (int j = 2; j * j <= i; j++) {       // i = 5   3*3=9 <5
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
