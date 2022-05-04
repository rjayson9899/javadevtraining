package ProgrammingInJava.chapter9;

abstract class Employee {
    String firstName, lastName;

    public Employee(String fName, String lName) {
        firstName = fName;
        lastName = lName;
    }

    public String toString() {
        return(firstName + " " + lastName);
    }

    abstract double pay(double period);
}
