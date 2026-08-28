package day7;

public class Employee extends Person {
    private int id;
    private double salary;
    private String title;

    public Employee(){
        super("Ahmed");
        System.out.println("I am Employee Default Constructor");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
