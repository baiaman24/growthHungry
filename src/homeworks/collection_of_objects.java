package homeworks;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class collection_of_objects {
    public static void main(String[] args) {

//        BankingAccount ba1 = new BankingAccount("Chase", 56000);
//
//        System.out.println(allAccountList);
//        BankingAccount ba2 = new BankingAccount("BOA", 6565465);
//        allAccountList.add(ba2);
//        BankingAccount ba3 = new BankingAccount("US Bank", 54645);
//        allAccountList.add(ba3);
//
//        for (BankingAccount obj : allAccountList) {
//            if (obj.getName().equalsIgnoreCase("Chase")) {
//                System.out.println(obj.getName());
//            }
//        }
        BankingAccount ba1 = new BankingAccount("Chase", 56000);
        BankingAccount.addAccount(ba1);
        BankingAccount ba2 = new BankingAccount("BOA", 6565465);
        BankingAccount.addAccount(ba2);
        BankingAccount ba3 = new BankingAccount("US Bank", 54645);
        BankingAccount.addAccount(ba3);
        System.out.println(BankingAccount.calculateTotalBalance());
    }
}
//no classes with the same name within the same package
//POJO - plain old java object- store info
class BankingAccount{
    private  String name;
    private double Balance;
    public static List<BankingAccount> allAccountList = new ArrayList<>();
    public BankingAccount(String name, double balance) {
        this.name = name;
        Balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return Balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }
    public static void addAccount(BankingAccount bankingAccount){
        allAccountList.add(bankingAccount);
    }

    public static double calculateTotalBalance(){
        double sum = 0;
        for(BankingAccount balance: allAccountList){
            sum+=balance.getBalance();
        }
        return sum;
    }
}