package demo;

public class savingsacoount {
    public long accountNum;
    public String accountHolderName;
    public double balance;
    public savingsacoount(long num, String name, double b){
        accountNum = num;
        accountHolderName = name;
        balance = b;
    }
    public savingsacoount(){

    }
}
class Main3 {
    public static void main(String[] args) {
        savingsacoount var = new savingsacoount();
        var.accountHolderName = "JOhn";
        var.accountNum = 546546544;
        var.balance = 27800.0;

        System.out.println(var.accountHolderName);
        System.out.println(var.accountNum);
        System.out.println(var.balance);

        savingsacoount var2 = new savingsacoount(4556856, "Baia", 275564.00);
        System.out.println(var2.accountNum);
        System.out.println(var2.accountHolderName);
        System.out.println(var2.balance);


    }
}
