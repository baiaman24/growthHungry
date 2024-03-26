package class35;

public class ThrowsInMethodSignature {
    public static void main(String[] args) {

    }
    public static void withdraw(int amount)throws Exception{
        int balance = 100;
        if (amount < balance){
            throw new Exception("Insufficient funds");
        }

    }
}
