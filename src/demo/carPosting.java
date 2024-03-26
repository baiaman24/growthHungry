package demo;

public class carPosting {
    public String name;
    public String model;
    public double askingPrice;
    public int mileage;
    public String  drive;
    public String color;
    public boolean isCleanTitle;

    public carPosting(String carName, String carModel, double carAskingPrice,
                      int carMileage, String carDrive, String carColor,
                      boolean isCarCleanTitle){
        name = carName;
        model =carModel;
        askingPrice = carAskingPrice;
        mileage = carMileage;
        drive = carDrive;
        color = carColor;
        isCleanTitle = isCarCleanTitle;
    }
    public carPosting(String carName, String carModel, double carAskingPrice,
                      int carMileage) {
        name = carName;
        model =carModel;
        askingPrice = carAskingPrice;
        mileage = carMileage;
    }
    public carPosting(String carName,double carAskingPrice){
        name = carName;
        askingPrice = carAskingPrice;
    }

}

class Main4 {
    public static void main(String[] args) {
        carPosting post1 = new carPosting("Ferrari", "418",
                35000.00, 15000, "RWD", "green",
                true);
        System.out.println(post1.askingPrice);
        System.out.println(post1.color);
        carPosting post2 = new carPosting("Bugatti", "Veyron", 355454.00, 565365);
        carPosting post3 = new carPosting("Rolls", 546541.00);
    }
}