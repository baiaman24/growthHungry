package class17;

public class class17_5 {
    public static void main(String[] args) {
        class17.class17_5 obj = new  class17.class17_5();
        char note = obj.grade();
        char gen = obj.gender();
        System.out.println(note  + gen);
    }
    public char grade(){
        return 'a';
    }
    public char gender(){
        return 'M';
    }
}
