package class22_Arrays;

public class class22_lastpractice {
    public static void main(String[] args) {
        String[] array = {"slama taka","vrat tiko", "volodimir tit","taka mamaba"};
        for(int i = 0; i < array.length;i++){
           int k = array[i].indexOf(" ");
           System.out.println(array[i].substring(k+1));
        }
    }
}
