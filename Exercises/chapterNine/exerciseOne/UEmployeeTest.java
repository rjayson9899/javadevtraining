package Exercises.chapterNine.exerciseOne;

public class UEmployeeTest {
    

    public static void main(String[] args) {
        UEmployee test1 = new UEmployee("Adam", 100);
        Faculty test2 = new Faculty("Noah", 500, "History");
        Staff test3 = new Staff("Lucas", 300, "Ph.D.");

        System.out.println("UEmployee Method Sweep:");
        System.out.println("Name: " + test1.getName() + ", Salary: " + test1.getSalary());

        System.out.println("Faculty Method Sweep:");
        System.out.println("Name: " + test2.getName() + ", Salary: " + test2.getSalary() + ", Department: " + test2.getDepartment());
        test2.setDepartment("Literature");
        System.out.println("Name: " + test2.getName() + ", Salary: " + test2.getSalary() + ", Department: " + test2.getDepartment());
        
        System.out.println("Staff Method Sweep:");
        System.out.println("Name: " + test3.getName() + ", Salary: " + test3.getSalary() + ", Title: " + test3.getTitle());
        test3.setTitle("Doctor");
        System.out.println("Name: " + test3.getName() + ", Salary: " + test3.getSalary() + ", Title: " + test3.getTitle());
    }
}
