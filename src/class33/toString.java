package class33;

public class toString {
    public static void main(String[] args) {
        Person person  = new Person("Elon", 55);
        System.out.println(person.toString());
    }
}

class Person{
    private String name;
     private int age;

    public Person(String name, int age) {
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
    public String toString(){
        return "name: " + name + " age " + age;
    }
}
