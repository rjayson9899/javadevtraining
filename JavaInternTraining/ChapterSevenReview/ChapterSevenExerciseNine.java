package ChapterSevenReview;
import java.util.Scanner;
import java.util.Random;

public class ChapterSevenExerciseNine {
    static Scanner userIn = new Scanner(System.in);

    public static int isUserTurn(){
        int user;
        user = userIn.nextInt();
        return user;
    }

    public static boolean isValidEntry(int user,int stone){
    
        if (user > 4 || stone < user){
            System.out.println(" You have entered an invalid input. ");
            return false;
        }
        
        return true;
    }

    public static int isCompTurn(int stone, int draw){
        int newstone;
        System.out.println("There are " + stone + " stone/s. The computer takes " + draw);
        newstone = stone - draw; 
        return newstone;
    }

    public static int drawStones(int stone){
        int comp;
        Random x = new Random();

        comp = x.nextInt(3 - 1 + 1) + 1;

        while (comp > stone){

            comp = x.nextInt(3 - 1 + 1) + 1;

        }
        return comp;
    }
    public static void main(String[]args){
        int stone;
        int user;
        int draw;
        Random x = new Random();

        stone = x.nextInt(30 - 15 + 1) + 15;

        do {

            System.out.println("There are " + stone + " stone/s. How many would you like? "); 
            user = isUserTurn();  
            if(isValidEntry(user, stone) == false){
                isUserTurn();
            }
            else{    
            stone -= user;
            if (stone == 0){
                System.out.println(" The computer has beat the player! ");
                System.exit(0);
            }
            draw = drawStones(stone);
            stone = isCompTurn(stone,draw);
            }
        }
        while (stone > 0);
        if (stone == 0){
            System.out.println("The player beats the computer! ");
            System.exit(0);
        }
        userIn.close();
    }
    
}
