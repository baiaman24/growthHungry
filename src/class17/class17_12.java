package class17;

public class class17_12 {
    public static void main(String[] args) {
       char grade = calculateAverage(65, 75, 95);
       System.out.println(grade);
    }
    public static char calculateAverage(int num1, int num2, int num3) {
        int avergae = (num1 + num2 + num3) / 3;
        if (avergae < 60) {
            return 'F';
        } else if (avergae >= 60 && avergae < 70) {
            return 'D';
        } else if (avergae >= 70 && avergae < 80) {
            return 'C';
        } else if (avergae >= 80 && avergae < 90) {
            return 'B';
        } else {
            return 'A';
        }
    }
}
