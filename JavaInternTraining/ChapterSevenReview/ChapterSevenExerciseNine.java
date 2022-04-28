import java.util.Scanner;
import java.util.Random;

public class ChapterSevenExerciseNine {

    public static int isUserTurn(int stone){
        int user;
        int newstone;

        Scanner userIn = new Scanner(System.in);

        user = userIn.nextInt();
        newstone = isValidEntry(user,stone);
        return newstone;
    }

    public static int isCompTurn(int stone, int draw){
        int newstone;
        System.out.println("There are " + stone + " stone/s. The computer takes " + draw);
        newstone = stone - draw; 
        if (stone == draw && newstone == 0){
            System.out.println("The player beats the computer! ");
            System.exit(0);
        }
        return newstone;
    }

    public static int isValidEntry(int user,int stone){
    
        if (user > 4 || stone < user){
            System.out.println(" You have entered an invalid input. ");
            isUserTurn(stone);
        }
        else  
        stone -= user;

        if (stone == user && stone == 0){
            System.out.println(" The computer has beat the player! ");
            System.exit(0);
        }

        return stone;
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

        Random x = new Random();

        stone = x.nextInt(30 - 15 + 1) + 15;

        do {

            System.out.println("There are " + stone + " stone/s. How many would you like? "); 
            stone = isUserTurn(stone);         
            stone = isCompTurn(stone,drawStones(stone));

        }
        while (stone > 0);

    }
}
