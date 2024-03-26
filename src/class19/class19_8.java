package class19;

public class class19_8 {
    public static void main(String[] args) {
        String str = "Salam Aleikum";
        int counter = 0;
        int num = 0;
        while (counter <= str.length()-1){
            switch (str.charAt(counter)){
                case 'e':
                case 'o':
                case 'u':
                case 'a':
                case 'i':
                    System.out.println(str.charAt(counter));
                num++;
                counter++;
                default:
                    counter++;
            }
        } System.out.println(num);
    }
}
