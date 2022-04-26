package Exercises.chapterSeven;

public class ExerciseOne {
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