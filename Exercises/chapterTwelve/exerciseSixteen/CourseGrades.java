package Exercises.chapterTwelve.exerciseSixteen;

import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.*;

public class CourseGrades {
    public static void main(String[] args) {
        final int STUDENTS = 12;
        final int EXAMS = 5;
        Scanner in = new Scanner(System.in);
        GradeBook records = new GradeBook(STUDENTS, EXAMS);
        File gradefile = new File(".\\Exercises\\chapterTwelve\\exerciseSixteen\\gradebook.dat");
        FileOutputStream out;

        records.getGrades(in);
        System.out.println();
        records.showGrades();
        System.out.println();

        for (int y = 0; y < STUDENTS; y++) {
            System.out.println("Student " + (y + 1) + " average: " + records.studentAvg(y));
        }

        System.out.println();

        for (int x = 0; x < EXAMS; x++) {
            System.out.println("Test " + (x + 1) + " average: " + records.testAvg(x));
        }

        in.close();

        try {
            out = new FileOutputStream(gradefile);
            ObjectOutputStream writeGrade = new ObjectOutputStream(out);
            writeGrade.writeObject(records);
            writeGrade.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
