package class27;
// class amazon is created
public class amazon {
    //instance variables are created
    String name;
    double price;
    String description;
}

class Main{
    public static void main(String[] args) {
        amazon var = new amazon();// object is created
        var.name = "Iphone14";// initialization of instance variables
        var.price = 899.99;
        var.description = "Max";

        System.out.println(var.name);
        System.out.println(var.price);
        System.out.println(var.description);
    }
}