package ProgrammingInJava.chapter9.exercise1;

public class Faculty extends UEmployee {
    
    private String departmentName;

    public Faculty(String name, double salary, String departmentName) {
        super(name, salary);
        this.departmentName = departmentName;
    }

    public void setDepartmentName(String departmentName){
        this.departmentName = departmentName;
    }

    public String getDepartmentName(){
        return(this.departmentName);
    }

}
