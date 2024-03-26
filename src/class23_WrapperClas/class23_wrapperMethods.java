package class23_WrapperClas;

public class class23_wrapperMethods {
    public static void main(String[] args) {
        String str = "25";
        byte num = Byte.parseByte(str);
        num+=25;
        System.out.println(num);
        String str1 = "25000";
        int num1 = Integer.parseInt(str1);
        System.out.println(num1/num);
        String str2 = "true";
        boolean isTrue = Boolean.parseBoolean(str2);
        System.out.println(isTrue);
    }
}
