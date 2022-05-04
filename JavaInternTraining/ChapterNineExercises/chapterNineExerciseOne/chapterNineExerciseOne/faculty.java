package chapterNineExerciseOne;
public class faculty extends universityEmployees{
    String deptName;

    public faculty(String name, double salary, String deptName){
        super(name,salary);
        this.deptName = deptName;
    }

    public void setDeptName(String name){
        name = deptName;
    }

    public String getDeptName(){
        return this.deptName;
    }
}
