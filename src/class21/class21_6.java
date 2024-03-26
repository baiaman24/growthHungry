package class21;

public class class21_6 {
    public static void main(String[] args) {
        String str = "Salam";
        char symbol = '*';
        StringBuilder sb = new StringBuilder(str);
        int length = sb.length();
        int i = 1;
        sb.insert(i, symbol);
        System.out.print(sb);

    }
}

