package class34;

public class Multiple_Interfaces {
    public static void main(String[] args) {

    }
}

interface Product2{
void  displatInfo();
}

interface  Shipping{
void calculateShipping();
}

interface Payment{
void processPayment();
}

class OnlineProduct implements Product2, Shipping, Payment{
    @Override
    public void displatInfo() {

    }

    @Override
    public void calculateShipping() {

    }

    @Override
    public void processPayment() {

    }
}
