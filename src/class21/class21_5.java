package class21;

public class class21_5 {
    public static void main(String[] args) {
        String firstName = "Baiaman";
        String secondName = "Taalaibekov";
        StringBuilder sb1 = new StringBuilder(firstName);
        StringBuilder sb2 = new StringBuilder(secondName);
        StringBuilder sb3 = new StringBuilder("M");
        sb1.append(" ").append(sb2).append(" ").append(sb3);
        char k = '\'';
        System.out.println(k);
        System.out.println(sb1);
    }
}
