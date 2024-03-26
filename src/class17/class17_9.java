package class17;

public class class17_9 {
    public static void main(String[] args) {
        class17.class17_9 obj = new class17.class17_9();
       double taxAmount = obj.payThisAmountOfTax(100000, 15);
       System.out.println(taxAmount);
    }

    public double payThisAmountOfTax(double salary, int taxPercentage) {
        return salary * (taxPercentage / 100.0);
    }
}