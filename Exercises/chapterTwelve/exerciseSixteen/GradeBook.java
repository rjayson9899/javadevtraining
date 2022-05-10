package Exercises.chapterTwelve.exerciseSixteen;

import java.io.Serializable;
import java.util.Scanner;

public class GradeBook implements Serializable {
    private final int STUDENTS;
    private final int EXAMS;
    private int[][] grades;

    public GradeBook(int students, int exams) {
        this.STUDENTS = students;
        this.EXAMS = exams;
        this.grades = new int[STUDENTS][EXAMS];
    }

    /*
     * Begins a sequence of input requests for
     * grades to be assigned to student exams
     * pre: Scanner object
     * post: Grade values assigned to all array indexes
     */
    public void getGrades(Scanner in) {
        for(int x = 0; x < STUDENTS; x++) {
            for (int y = 0; y < EXAMS; y++) {
                System.out.print("[Student " + (x + 1) + "] Enter grade of test " + (y + 1) + ": ");
                grades[x][y] = in.nextInt();
            }
            System.out.println();
        }
    }

    /*
     * Prints all grade values stored in
     * array. Output is directly shown in
     * Terminal
     * pre: none
     * post: Grade values outputted to terminal
     */
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

    /*
     * Computes for an individual students
     * average grade base on all their test
     * scores
     * pre: none
     * post: Student grade average as double
     */
    public double studentAvg(int student) {
        double testAverage = 0;

        for(int y = 0; y < EXAMS; y++) {
            testAverage += (double) grades[student][y];
        }

        testAverage /= 5;

        return testAverage;
    }

    /*
     * Computes for a particular average exam grade
     * from the scores of all students
     * pre: none
     * post: Average exam grade as double
     */
    public double testAvg(int exam) {
        double studentAverage = 0;

        for(int x = 0; x < STUDENTS; x++) {
            studentAverage += (double) grades[x][exam];
        }
        
        return studentAverage /= 12;
    }
}
