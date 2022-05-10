package chapter10exer12;

public class GradeBook {
    private int[][] grades;

    public GradeBook(int[][] grades){
        this.grades = grades;
    }

    public int[][] getGrades(){
        return grades;
    }
    
    public int getStudentNum(int student){
        return grades[0][student];
    }

    public void showGrades(){
        for(int x = 0; x<grades[0].length; x++){
            System.out.println("student num. " + grades[0][x] + "\ngrades: ");
            for(int y = 0; y<grades[1].length; y++){
                System.out.format("%-5s \n",grades[1][y]);
            }
            System.out.println(" ");
        }
        
    }

    public double studentAvg(int studentNum){
        double average = 0;
        for(int x = 0; x < grades[1].length; x++){
           average += grades[studentNum - 1][x];
        }
        average = average/grades[1].length;
        return average;
    }

    public double testAvg(int testAvg){
        double total = 0;
        for(int x = 0; x < grades[1].length; x++){
            total += grades[testAvg - 1][x]; 
        }
        total = total/grades[1].length;
        return total;
    }

    public void showStudGrade(int studNum){
        for(int x = 0; x < grades[1].length; x++){
            
             System.out.println(grades[1][x]); 
        }

    }
}
