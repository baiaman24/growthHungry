package class33;

public class inheritance1 {
    public static void main(String[] args) {
        CheckingAccount ch1 = new CheckingAccount(51354, 30.00);
        ch1.setBalance(20);
        System.out.println(ch1.getBalance());
        System.out.println(ch1.getAccountNumber());

        ch1.deposit(500);
        System.out.println(ch1.getBalance());
        ch1.withdraw(320);
        ch1.applyMonthlyFee();
        System.out.println(ch1.getBalance());
        System.out.println("=========================================================");
        CheckingAccount ch3 = new CheckingAccount(5000,664684, 20.00);
        ch3.withdraw(900);
        System.out.println(ch3.getBalance());
        ch3.withdraw(400);



    }
}

class BankAccount{
    private double balance;
    private final long accountNumber;

    public BankAccount(long accountNumber){
        this.accountNumber = accountNumber;
    }
    public  BankAccount(double balance, long accountNumber){
        this(accountNumber);
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public long getAccountNumber(){
        return accountNumber;
    }
    public void withdraw(double amount){
        balance-=amount;
    }
    public void deposit(double amount){
        balance+=amount;
    }
}

class CheckingAccount extends BankAccount{
    private double monthlyFee;
    private double dailyWithdrawalAmount;
    public CheckingAccount(long accountNumber, double monthlyFee){
        super(accountNumber);
        this.monthlyFee = monthlyFee;
    }
    public CheckingAccount(double balance, long accountNumber, double monthlyFee){
        super(balance, accountNumber);
        this.monthlyFee = monthlyFee;

    }

    public double getMonthlyFee() {
        return monthlyFee;
    }
    public void applyMonthlyFee(){
        withdraw(monthlyFee);
    }
    @Override
    public void withdraw(double amount){
        if(dailyWithdrawalAmount + amount > 1000){
            System.out.println("You reached your daily limit you can only withdraw " + (1000 - dailyWithdrawalAmount));
        } else{
            setBalance(getBalance() - amount);
            dailyWithdrawalAmount+=amount;
        }
    }
}
