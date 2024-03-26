package homeworks;

import java.util.ArrayList;
import java.util.List;

public class collections_instance_variables {
    public static void main(String[] args) {
        Employee sc = new Employee("Baiaman", 25, "SDET", 125000);
        sc.addProjects("salam");
        sc.addProjects("kandai");
        sc.addProjects("men uirondum");
        System.out.println(sc.getProjects());
    }
}

class Employee {
    private String name;
    private int age;
    private String department;
    private  double salary;
    private List<String> projects;
    public Employee(String name, int age, String department, double salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }
    public Employee(String name, int age, String department, double salary, List<String> projects){
        this(name, age, department, salary);
        this.projects = projects;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public List<String> getProjects(){
        return projects;
    }
    public void addProjects(String project){
        projects.add(project);
    }
}