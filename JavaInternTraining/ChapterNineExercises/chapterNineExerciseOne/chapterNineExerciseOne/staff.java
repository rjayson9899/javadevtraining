package chapterNineExerciseOne;
public class staff extends universityEmployees{

    String jobTitle;

    public staff(String name, double salary , String jobTitle){
        super(name,salary);
        this.jobTitle = jobTitle;
    }

    public void setJobTitle(String job){
        job = this.jobTitle;

    }

    public String getJobTitle(){
        return jobTitle;
    }
}

