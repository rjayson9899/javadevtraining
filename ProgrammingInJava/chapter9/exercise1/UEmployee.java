package ProgrammingInJava.chapter9.exercise1;

public class UEmployee {
    
    private String name;
    private double salary;

    public UEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary(){
        return(salary);
    }

    public String getName(){
        return(name);
    }
}
