package class18;

public class class18_7 {
    public static void main(String[] args) {
        String str = "Salam Aleikum Salam";
        String str2 = "LA jbkdjbfjkdbJBKJBKJB jjbkvb jbkjb LA";
        int indexO = str.indexOf("Aleikum");
        char aout = str.charAt(str.length() - 1);
        int indexe = str.indexOf("am", 6);
        int lastIndex = str.lastIndexOf("Salam");
        int lastIndex2 = str2.lastIndexOf("LA");
        System.out.println(indexO);
        System.out.println(aout);
        System.out.println(indexe);
        System.out.println(lastIndex);
        System.out.println(lastIndex2);
    }
}
