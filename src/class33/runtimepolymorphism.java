package class33;

public class runtimepolymorphism {
    public static void main(String[] args) {
        Animal1 a = new Animal1();
        a.makeSound();
        Animal1 a1 = new Cat();
        a1.makeSound();
        Animal1 a2 = new Dog1();
        a2.makeSound();
    }
}

class Animal1{
    public void makeSound(){
        System.out.println("PArent Class");
    }
}

class Cat extends Animal1{
    @Override
    public void  makeSound(){
        System.out.println("Meow");
    }
}

class Dog1 extends Animal1{
    @Override
    public void  makeSound(){
        System.out.println("Bark");
    }
}
