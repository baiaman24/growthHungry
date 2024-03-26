package class33;

public class method_overriding {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
        d.eat();
        d.getNumberOfLegs();
        Animal animal = new Animal();
        animal.makeSound();


    }
}

class Animal{
    public void getNumberOfLegs(){
        System.out.println("4 legs");
    }
    public void eat(){
        System.out.println("Eating");
    }
    public void makeSound(){
        System.out.println("Animal makes a sound");
    }
}


class Dog extends Animal{
    @Override
public void makeSound(){

    System.out.println("Bark Bark");
}
}
