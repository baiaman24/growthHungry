package class17;

public class class17_11 {
    public static void main(String[] args) {
       String salam = greet("jhkjhvhj", "kjhlkh;lkhj'");

       System.out.println(salam);

        String salam2 = greet("hellowedevx.com", "abc178$$");
        System.out.println(salam2);

    } public static String greet(String userName, String password){
        if (userName.equals("hellowedevx.com") && password.equals("abc178$$")){
            return "Welcome " + userName;
        } else {
            return "Invalid username or password";
        }
    }
}
