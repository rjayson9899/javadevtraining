/*
 * Made by: Roger Jayson M. Mendez III
 * On: 4/26/22
 * The intention of this exercise is to be able to
 * print a house onto the terminal through the use of
 * methods. Three methods are presented, one to draw the roof,
 * one for the base, and one for the pathway.
 */
package Exercises.chapterSeven;

public class ExerciseOne {
    /*
     * Prints a roof 8 characters wide and 
     * 4 characters long.
     * pre: none
     * post: Prints a roof onto the terminal
     */
    public static void addRoof() {
        int drawCoord = 3;
        
        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 8; x++) {
                if (x == drawCoord || x == (7 - drawCoord)) {
                    if (x < 4) {
                        System.out.print("/");
                    }
                    else {
                        System.out.print("\\");
                    }
                }
                else {
                    if (y == 3) {
                        System.out.print("_");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
            drawCoord--;
        }

    }

    /*
     * Prints a house base 8 characters wide and
     * 4 characters long
     * pre: none
     * post: House base printed onto the terminal
     */
    public static void addBase() {
        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 8; x++) {
                if (x == 0 || x == 7) {
                    System.out.print("|");
                }
                else {
                    if (y == 3) {
                        System.out.print("_");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    /*
     * Prints a walkway 2 characters long for the first line
     * and 11 characters long for the second line.
     * pathway has 3 whitespaces for padding to center path with
     * house.
     * pre: none
     * post: House pathway printed onto the terminal.
     */
    public static void addWalk() {
        System.out.println("   **");
        for (int i = 0; i < 14; i++) {
            if (i < 3) {
                System.out.print(" ");
            }
            else {
                System.out.print("*");
            }
        }
    }

    public static void main(String[] args) {
        addRoof();
        addBase();
        addWalk();
    }
}