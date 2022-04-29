import java.util.Scanner;

public class ChapterSevenExerciseFour {

    public static void drawBar(int length){
        for (int y = 0; y <= length; y++){
            for (int i = 0; i <= length; i++) {
                if (int x = 0;){
                System.out.print("*");
                }
            }
        }
                System.out.println();
    }

    public static void addSpaces(){

    }
    public static void main(String[] args){

        int user;

        Scanner userIn = new Scanner(System.in);

        System.out.println("Enter the size: ");
        user = userIn.nextInt();

        drawBar(user);
        //addSpace();
        userIn.close();
    }
}
