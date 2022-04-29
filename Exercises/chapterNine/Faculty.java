package Exercises.chapterNine;

public class Faculty extends UEmployee {
    private String title;

    public Faculty(String name, double salary, String title) {
        super(name, salary);
        this.title = title;
    }
    
    public void setDepartment(String department) {
        this.title = department;
    }

    public String getDepartment() {
        return this.title;
    }
}
