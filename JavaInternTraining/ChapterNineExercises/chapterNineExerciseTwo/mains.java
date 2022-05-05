package chapterNineExerciseTwo;
import java.util.Scanner;

public class mains{

    public static void main(String[] args){

        int user;

        Personal pA = new Personal(10.00, "Marga", "Gonzales", "8 New-york", "Bulacan City", "NCR", "1011");
        Business bA = new Business(50.00, "Yks", "Peralta", "7 Mapagmahal", "Quezon City", "NCR", "1101");
        Scanner userIn = new Scanner(System.in);
        do{
        System.out.println("Hello please enter what type of account: ");
        System.out.println("1. Personal");
        System.out.println("2. Business");
        user = userIn.nextInt();
        switch(user){
            case 1:
            pA.getInfo();
            pA.checker();
            pA.newbal();
            break;
            case 2:
            bA.getInfo();
            bA.checker();
            bA.newbal();
            break;
        }
    }while(user != 0);
        userIn.close();

    }
}