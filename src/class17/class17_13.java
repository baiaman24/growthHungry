package class17;

public class class17_13 {
    public static void main(String[] args) {
       double tax = calculateTax(100, true);
       System.out.println(tax);
    } public static double calculateTax(double salary, boolean isMarried){
        if (salary  < 100 && !isMarried){
            return 0.08;
        } else if ((salary < 100) && isMarried){
            return 0.05;
    }    else if (salary >= 100 && isMarried){
            return 0.1;
        } else {
        return 0.15;
        }
}
}
