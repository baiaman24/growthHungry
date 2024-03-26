package class35;

public class catchEXceptionMessages {
    public static void main(String[] args) {
        method1();
    }
    public static void method1(){
        try{
            System.out.println("Started try");
            int[] nums = new int[2];
            int num = nums[5];
            System.out.println("Everything went well and finished try");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
}


