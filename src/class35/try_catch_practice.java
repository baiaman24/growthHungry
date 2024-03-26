package class35;

public class try_catch_practice {
    public static void main(String[] args) {
method1();
    }
    public static  void method1() {
        try {
            double result = 10 / 0;
        } catch (ArithmeticException e){
            System.out.println("ArithmeticException: / by zero occured but handled");
        }
    }
}


