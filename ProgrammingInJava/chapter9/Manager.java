package ProgrammingInJava.chapter9;

public class Manager extends Employee {
    double yearlySalary;

    public Manager(String fName, String lName, double sal) {
        super(fName, lName);
        yearlySalary = sal;
    }

    public double getSalary() {
        return(yearlySalary);
    }

    public double pay(double weeks){
        double payEarned;

        payEarned = (yearlySalary / 52) * weeks;
        return(payEarned);
    }

    public String toString() {
        return(super.toString() + ", manager");
    }
}
