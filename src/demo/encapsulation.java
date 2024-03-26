package demo;

public class encapsulation {
    public static void main(String[] args) {
        ChaseCheckingAccount c1  = new ChaseCheckingAccount("Baiaman", "54654", 54564535, 54354.54);
        System.out.println(c1.getAccountNum());
        System.out.println(c1.getRoutingNum());
        System.out.println(c1.getName());
        System.out.println(c1.getBalance());
        c1.setAccountNum("55555");
        System.out.println(c1.getAccountNum());
        c1.setBalance(-100);
        System.out.println(c1.getBalance());
    }
}

class ChaseCheckingAccount{
    private String name;
    private String accountNum;
    private int routingNum;
    private double balance;

    public ChaseCheckingAccount(String name, String accountNum, int routingNum, double balance) {
        this.name = name;
        this.accountNum = accountNum;
        this.routingNum = routingNum;
        this.balance = balance;
    }

    public String getAccountNum() {
        return accountNum;
    }
    public int getRoutingNum(){
        return routingNum;
    }
    public String getName(){
        return name;
    }
    public double getBalance(){
        return balance;
    }

    public void setAccountNum(String accountNum){
        this.accountNum = accountNum;
    }
    public void setBalance (double balance){
        if(balance > 0 ) {
            this.balance = balance;
        }
        else {
            System.out.println("Negative numbers can not be assigned");
        }
    }

}