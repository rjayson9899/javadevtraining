package chapter9exer1;

public class Staff extends UEmployee {

    private String jobTitle;

    public Staff(String name, double salary, String jobTitle) {
        super(name, salary);
        this.jobTitle = jobTitle;
    }
    
    public String getJobTitle(){
        return jobTitle;
    }

    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }
    
}
