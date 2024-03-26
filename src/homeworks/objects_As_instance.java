package homeworks;

import java.util.ArrayList;
import java.util.List;

public class objects_As_instance {
    public static void main(String[] args) {
        Address ad1 = new Address("Bakayeva 15", "Bishkek", 45645, "Kyrgyzstan");
        Address ad2 = new Address("Friedenau Str.15", "Stuttgart", 70188, "Germany");
        Account bayishChecking = new Account("54354", 45645.44);
        Account bayishSavings = new Account("45642", 4645.45);
        List<Account> bayishAccounts = new ArrayList<>();
        bayishAccounts.add(bayishChecking);
        bayishAccounts.add(bayishSavings);
        Account zarinChecking = new Account("65645", 5434.45);
        Account zarinaSavings = new Account("45344", 54654.54);
        List<Account> zarinaAccounts = new ArrayList<>();
        zarinaAccounts.add(zarinaSavings);
        zarinaAccounts.add(zarinChecking);

        Customer c1 = new Customer("Bayish", ad1, bayishAccounts);
        Customer c2 = new Customer("Zarina", ad2, zarinaAccounts);
        List<Customer> chaseCustomer = new ArrayList<>();
        chaseCustomer.add(c1);
        chaseCustomer.add(c2);
        Bank chase = new Bank("Chase", chaseCustomer);
        bayishSavings.deposit(5622);
        bayishSavings.withdraw(10267);
        System.out.println(chase.getName());
        double result = depositFunds(chase, "Zarina", "65645", 5000);
        System.out.println(result);
       printAccounts(chase);
    }
    public static void printAccounts(Bank bank) {
        List<Customer> customersList1 = bank.getCustomersList();
        for (Customer customerObj : customersList1) {
            System.out.println(customerObj.getName());
            List<Account> accountList1 = customerObj.getAccounts();
            for (Account accountObj : accountList1) {
                System.out.println("Account number : " + accountObj.getAccountNumber());
                System.out.println("Account balance : " + accountObj.getBalance());
            }
        }
    }
    public static double depositFunds(Bank bank, String customerName, String accountNum, double amount){
        List<Customer> customerList = bank.getCustomersList();
        for(Customer customerObj : customerList){
            if(customerObj.getName().equalsIgnoreCase(customerName)){
                List<Account> accountList = customerObj.getAccounts();
                for(Account accountObj: accountList){
                    if(accountObj.getAccountNumber().equalsIgnoreCase(accountNum)){
                      accountObj.deposit(amount);
                      return accountObj.getBalance();
                    }
                }
            }
        }
        return 0.0;
    }
}


class Customer{
    private String name;
    private Address address;
    private List<Account> accounts;
    public Customer(String name, Address address, List<Account> accounts){
        this.accounts =accounts;
        this.name = name;
        this.address = address;
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public Address getAddress(){
        return address;
    }
    public void setAddress(Address newAddress){
        this.address = newAddress;
    }
    public List<Account> getAccounts(){
        return accounts;
    }
    public void setAccounts(List<Account> accounts){
        this.accounts = accounts;
    }
}

class Address{
    private String street;
    private String city;
    private int zipCode;
    private String country;

    public Address(String street, String city, int zipCode, String country){
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;
    }
    public String getStreet(){
        return street;
    }
    public void setStreet(String newStreet){
        this.street = newStreet;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String newCity){
        this.city = newCity;
    }
    public int getZipCode(){
        return zipCode;
    }
    public void setZipCode(int newZipCode){
        this.zipCode = newZipCode;
    }
    public String getCountry(){
        return country;
    }
    public void setCountry(String newCountry){
        this.country = newCountry;
    }


}

class Bank{
    private String name;
    private List<Customer> customersList;
    public Bank(String name, List<Customer> customersList){
        this.name = name;
        this.customersList = customersList;
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public List<Customer> getCustomersList(){
        return customersList;
    }
    public void setCustomersList(List<Customer> newCustomersList){
        this.customersList = newCustomersList;
    }

    }



class Account{
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void deposit (double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("Error: account balance is insufficient.");
        } else{
            balance-=amount;
        }
    }
}




