package chapterNineExerciseOne;

public class universityEmployees {
    
    String eName;
    double eSalary;

    public universityEmployees(String name, double salary){
        this.eName = name;
        this.eSalary = salary;
    }

    public void setName(String name){
        name = eName;
    }

    public String getName(){
        return this.eName;
    }

    public void setSalary(double salary){
        salary = this.eSalary;
    }

    public double getSalary(){
        return this.eSalary;
    }
}
