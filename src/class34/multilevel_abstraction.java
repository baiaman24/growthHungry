package class34;

public class multilevel_abstraction {
    public static void main(String[] args) {
        Product phone = new Electronics("Phone",999.99, "Iphone");
        Product book = new Books("Syngan Kylych", 10.99, "Aitmatov");
        phone.getProductInfo();
        book.getProductInfo();

        System.out.println(phone.getProductType());
        System.out.println(book.getProductType());
        System.out.println(phone.calculateShippingCost());
        System.out.println(book.calculateShippingCost());

    }
}


abstract class ShippingProvider{
    public abstract double calculateShippingCost();
}

abstract class Product extends ShippingProvider{
    private String name;
    private  double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract String getProductType();
    public void getProductInfo(){
        System.out.println("Product name: " + name);
        System.out.println("Product price: " + price);
    }
}

class Electronics extends  Product{
    private String brand;

    public Electronics(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    @Override
    public double calculateShippingCost() {
        return 10.0;
    }
    @Override
    public String getProductType(){
        return "Electronics";
    }
}

class Books extends Product{
    private String author;

    public Books(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    @Override
    public String getProductType() {
        return "Book";
    }
    @Override
    public double calculateShippingCost() {
        return 3.0;
    }
}