package class18;

public class class18_8 {
    public static void main(String[] args) {
        int ta = findSubsequenceIndex("Hello World!","l", 5);
        System.out.println(ta);

    } public static int findSubsequenceIndex(String str, String str2, int num){
        return str.indexOf(str2, num);
    }
}
