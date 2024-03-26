package class21;

public class class21_7 {
    public static void main(String[] args) {
        String str = "some exercise here and there";
        StringBuilder sb = new StringBuilder(str);
        String str2 = "e";


        for(int i = 0; i < sb.length(); i++){

            int start = sb.indexOf(str2);
            int index = str2.length();
            int end = start + index;
            sb.delete(start, end);
        } System.out.println(sb);

    }
}
