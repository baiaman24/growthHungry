package homeworks;

public class finalKeyword {
    public static void main(String[] args) {
        Circle sc = new Circle(5);
        System.out.println(sc.Circlemense());
    }
}

class Circle{
    public final double pI = 3.14;
    public double radius;

    Circle(double radius){
        this.radius = radius;
    }

    public double Circlemense(){
        return radius * 2 * pI;
    }


}
