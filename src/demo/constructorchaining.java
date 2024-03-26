package demo;

public class constructorchaining {
    public static void main(String[] args) {
        StudentCheckingAccount sc = new StudentCheckingAccount("Steve Jobs", 4565.55, "545434", 56565);
        StudentCheckingAccount sc1 = new StudentCheckingAccount("Biilll", "454555", 54654);
        System.out.println(sc1.studentName +sc1.accountNum + sc1.balance);
    }
}
class StudentCheckingAccount{
    public String studentName;
    public double balance;
    public String accountNum;
    public int routingNum;

    public StudentCheckingAccount(String studentName, double balance,
                                  String accountNum, int routingNum){
        this.studentName = studentName;
        this.balance = balance;
        this.accountNum = accountNum;
        this.routingNum = routingNum;
    }

//    public StudentCheckingAccount(String studentName, String accountNum, int routingNum){
//        this.studentName = studentName;
//        this.accountNum = accountNum;
//        this.routingNum = routingNum;
//    }
public StudentCheckingAccount(String studentName, String accountNum, int routingNum){
        this(studentName, 0.0, accountNum, routingNum);
}
public StudentCheckingAccount(String studentName, String accountNum){
        this(studentName, accountNum, 546454);
}
}
