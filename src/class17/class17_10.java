package class17;

public class class17_10 {
    public static void main(String[] args) {
        boolean tadam = isDivisible(10, 2);
        System.out.println(tadam);
    }public static boolean isDivisible(int num1, int num2){
        if (num1%num2 == 0 ){
            return true;
        } else{
            return false;
        }
    }
}
