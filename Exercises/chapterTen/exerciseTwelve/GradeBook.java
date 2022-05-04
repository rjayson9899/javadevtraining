package Exercises.chapterTen.exerciseTwelve;

import java.util.Scanner;

public class GradeBook {
    private final int STUDENTS;
    private final int EXAMS;
    private int[][] grades;

    public GradeBook(int students, int exams) {
        this.STUDENTS = students;
        this.EXAMS = exams;
        this.grades = new int[STUDENTS][EXAMS];
    }

    public void getGrades(Scanner in) {
        for(int x = 0; x < STUDENTS; x++) {
            for (int y = 0; y < EXAMS; y++) {
                System.out.print("[Student " + (x + 1) + "] Enter grade of test " + (y + 1) + ": ");
                grades[x][y] = in.nextInt();
            }
            System.out.println();
        }
    }

    public void showGrades() {
        for(int x = 0; x < STUDENTS; x++) {
            System.out.println("Student " + (x + 1) + " grades:");
            for (int y = 0; y < EXAMS; y++) {
                System.out.print("Test " + (y + 1) + ": ");
                System.out.println(grades[x][y]);
            }
            System.out.println();
        }
    }

    public double studentAvg(int student) {
        double testAverage = 0;

        for(int y = 0; y < EXAMS; y++) {
            testAverage += (double) grades[student][y];
        }

        testAverage /= 5;

        return testAverage;
    }

    public double testAvg(int exam) {
        double studentAverage = 0;

        for(int x = 0; x < STUDENTS; x++) {
            studentAverage += (double) grades[x][exam];
        }
        
        return studentAverage /= 12;
    }
}
