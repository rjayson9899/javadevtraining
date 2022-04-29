package chapter9exer1;

public class App {
    public static void main(String[] args) {
        
        Faculty faculty = new Faculty("Mac", 20000, "IT");
        Staff staff = new Staff("Kate", 45000, "Manager");

        System.out.println("Name: " + faculty.getName());
        System.out.println("Salary: " + faculty.getSalary());
        System.out.println("Department Name: " + faculty.getDepName() + "\n");

        System.out.println("Name: " + staff.getName());
        System.out.println("Salary: " + staff.getSalary());
        System.out.println("Job title: " + staff.getJobTitle());


    }
}
