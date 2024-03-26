package class18;

public class class18_11 {
    public static void main(String[] args) {
      String rep2 =  rep("I believe i can do it for you");
      System.out.println(rep2);
    } public static String rep(String str){
        String count = str.replaceAll("\\s", "");
        return count;
    }
}
