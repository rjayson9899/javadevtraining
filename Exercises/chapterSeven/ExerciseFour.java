/*
 * Made by: Roger Jayson M. Mendez III
 * On: 4/26/22
 * This excercise focuses on creating a program
 * capable of printing an isosceles triangle using 
 * 2 methods. The first method is expected to only be able to
 * draw "*" marks and the second is expected to only generate
 * white spaces. The amount of "*" and whitespaces correspond to
 * the value of the integer parameter set on the method.
 * The program is expected to be able to accept user input 
 * regarding the size of the triangle and draw it using that.
 */
package Exercises.chapterSeven;

import java.util.Scanner;

public class ExerciseFour {
    /*
     * Draws "*" marks in the same line.
     * The amount of "*" marks drawn correspond 
     * to the value size parameter.
     * pre: none
     * post: "*" marks equal to the size parameter
     *       printed on the terminal
     */
    public static void drawBar(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print("*");
        }
    }

    /*
     * Prints whitespaces in the same line.
     * The amount of whitespaces correspond 
     * to the value size parameter.
     * pre: none
     * post: whitespaces equal to the size parameter
     *       printed on the terminal
     */
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