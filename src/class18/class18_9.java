package class18;

public class class18_9 {
    public static void main(String[] args) {
        String str = "hey! How are you?";
        String str2 = str.replace("ou","a");
        String str3 = str.replaceFirst("hey", "Hello");
        String str4 = str.replace("tr", "ou");
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}
