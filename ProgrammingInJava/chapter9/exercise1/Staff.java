package ProgrammingInJava.chapter9.exercise1;

public class Staff extends UEmployee{
    
    private String jobTitle;

    public Staff (String name, double salary, String jobTitle){
        super(name,salary);
        this.jobTitle = jobTitle;
    }

    public void setJobTitle (String jobTitle){
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return(this.jobTitle);
    }
}
