package class33;

import java.util.Objects;

public class hashcodeequals {
    public static void main(String[] args) {
        Person1 person1 = new Person1("Elon", 55);
        Person1 person2 = new Person1("Elon", 55);
        System.out.println(person1 == person2);
        System.out.println(person1.equals(person2));

    }
}

class Person1{
    private String name;
    private  int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    @Override
    public int hashCode(){
        return Objects.hash(name, age);
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return  true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        Person1 other = (Person1) obj;
        return Objects.equals(name, other.getName()) && age == other.getAge();
    }

}





