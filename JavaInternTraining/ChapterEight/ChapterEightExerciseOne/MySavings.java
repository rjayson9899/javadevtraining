package ChapterEight.ChapterEightExerciseOne;
import java.util.Scanner;
public class MySavings {
    public static void main(String[] args) {
        int choice;

        Scanner userIn = new Scanner(System.in);

        System.out.println("1. Show total in bank.");
        System.out.println("2. Add a penny.");
        System.out.println("3. Add a nickel.");
        System.out.println("4. Add a dime.");
        System.out.println("5. Add a quarter.");
        System.out.println("6. Take money out of bank.");
        System.out.println("Enter 0 to quit.");
        System.out.println("Enter your choice: ");
        choice = userIn.nextInt();
        
    }
}
