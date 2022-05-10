package Exercises.chapterTwelve.exerciseSixteen;

import java.io.*;

public class GradeBookReader {
    public static void main(String[] args) {
        File recordFile = new File(".\\Exercises\\chapterTwelve\\exerciseSixteen\\gradebook.dat");
        GradeBook records;
        FileInputStream in;

        try {
            in = new FileInputStream(recordFile);
            ObjectInputStream read = new ObjectInputStream(in);
            records = (GradeBook) read.readObject();
            read.close();

            records.showGrades();
            for (int y = 0; y < 12; y++) {
                System.out.println("Student " + (y + 1) + " average: " + records.studentAvg(y));
            }
            System.out.println();
            for (int x = 0; x < 5; x++) {
                System.out.println("Test " + (x + 1) + " average: " + records.testAvg(x));
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
