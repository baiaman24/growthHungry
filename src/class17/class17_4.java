package class17;

public class class17_4 {
    public static void main(String[] args) {
        String ask = surname();
        String name = giveMyName();
        String elon = combo();
        System.out.println(ask+name);
        System.out.println(elon);
    }
    public static String giveMyName(){
        return "Askar";
    }
    public static String surname(){
       return "Musakunov";
    }
    public static String combo(){
        String name = "Elon";
        String surname = "Musk";
        return surname +" "+name;
    }
}
