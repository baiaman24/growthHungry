package class19;

public class class19_16 {
    public static void main(String[] args) {
       int count = countWords("  ");
       System.out.println(count);
    }
    public static int countWords(String sentence){
        int sum = 1;
        if (!sentence.trim().isEmpty()) {

            for (int counter = 0; counter <= sentence.length() - 1; counter++) {
                if (sentence.charAt(counter) == ' ') {
                    sum++;
                }

            }
            return sum;
        } else {
            return -1;
        }
    }
}
