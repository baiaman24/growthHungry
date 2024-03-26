package class17;

public class class17_15 {
    public static void main(String[] args) {
       char grade = determineGrade(90);
        System.out.println(grade);
        String j = "baiaman";
        String k = "class";
        String s = j.concat(" ").concat(k);
        System.out.println(s);
    }
    public static char determineGrade(int score){
        switch (score) {
            case 100:
            case 90:
                return 'A';
            case 80:
                return 'B';
            case 70:
                return 'C';
            case 60:
                return 'D';
            default:
                return 'F';
        }
    }
}
