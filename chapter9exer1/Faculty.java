package chapter9exer1;

public class Faculty extends UEmployee {
    
    private String depName;
    
    
    public Faculty(String name, double salary, String depName) {
        super(name, salary);
        this.depName = depName;
    }

    public void setDepName(String depName){
        this.depName = depName;
    }

    public String getDepName(){
        return depName;
    }
    
}
