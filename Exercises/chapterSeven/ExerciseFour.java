package Exercises.chapterSeven;

import java.util.Scanner;

public class ExerciseFour {
    public static void drawBar(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print("*");
        }
    }

    public static void addSpaces(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        int get;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter size: ");
        get = in.nextInt();

        for (int i = 0; i < get; i++) {
            addSpaces(get - i);
            drawBar((1 + (2 * i)));
            System.out.println();
        }

        in.close();
    }
}