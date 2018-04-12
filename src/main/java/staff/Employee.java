package staff;

public abstract class Employee {

    private String name;
    private String nin;
    private double salary;

    public Employee(String name, String nin, double salary) {
        this.name = name;
        this.nin = nin;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != "" && name != null ) this.name = name;
    }

    public String getNin() {
        return nin;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double increase) {
        if (increase >= 0) salary = (salary * (100 + increase))/100;
    }

    public double payBonus() {
        return salary * 0.01;
    }
}
