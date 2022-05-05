package ProgrammingInJava.chapter9.exercise1;

public class UEmployeeTest {
    public static void main(String[] args) {
        
        Faculty facultyMember = new Faculty("Edmark", 50000, "Software Development Department");
        Staff staffMember = new Staff("Jayson", 25000, "Junior Java Developer");

        System.out.println("Name: " + facultyMember.getName());
        System.out.println("Salary: " + facultyMember.getSalary());
        System.out.println("Department: " + facultyMember.getDepartmentName());

        System.out.println("\nName: " + staffMember.getName());
        System.out.println("Salary: " + staffMember.getSalary());
        System.out.println("Job Title: " + staffMember.getJobTitle());
    }
    
}
