package class22_Arrays;

public class class22_largest_array {
    public static void main(String[] args) {
        int[] whole = {100, -560, 39, 541, 3, 0, 1};
        int largestValue = whole[0];
        double[] decimal = {20.0, 3.2, 9.7, 8.79, 0.002, -85.7, 12.0078};
        double smallestValue = decimal[0];

        for(int index = 0; index < whole.length ; index++){
            if(largestValue >= whole[index]){
                largestValue = whole[index];
            }
        }
        for(int index = 0; index < decimal.length ; index++){
            if(smallestValue <= decimal[index]){
                smallestValue = decimal[index];
            }
        }
        System.out.println(largestValue);
    }
}
