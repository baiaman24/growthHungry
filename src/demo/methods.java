package demo;

public class methods {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount("ABS35435");
        System.out.println(ba.getAccountNumber());
    }
}


class BankAccount{
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber){
        this.accountNumber = accountNumber;
        balance = 0.0;

    }
    public String getAccountNumber(){
        return accountNumber;
    }
}