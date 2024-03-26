package class19;

public class class19_11 {
    public static void main(String[] args) {
        validateInput(0);
    }
    public static void validateInput(int num){
        System.out.println("Enter a positive integer:");

        do{
            if (num > 0){
                System.out.println("Valid number:" + num);
            } else {
                System.out.println("Error: Please enter a positive integer.");
            }
        } while ( num <= 0 );
    }
}
