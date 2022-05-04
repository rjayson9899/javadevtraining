package ChapterEightExerciseOneV1;
import java.util.Scanner;
public class MySavings {
    public static void main(String[] args) {
        int choice;

        Scanner userIn = new Scanner(System.in);
        PiggyBank p = new PiggyBank();
    do{
        System.out.println("1. Show total in bank.");
        System.out.println("2. Add a penny.");
        System.out.println("3. Add a nickel.");
        System.out.println("4. Add a dime.");
        System.out.println("5. Add a quarter.");
        System.out.println("6. Take money out of bank.");
        System.out.println("Enter 0 to quit.");
        System.out.println("Enter your choice: ");
        
        choice = userIn.nextInt();
        switch(choice){
            case 1:
                p.showTotal();
            break;

            case 2:
                p.addPenny();
            break;

            case 3:
                p.addNickel();
            break;

            case 4:
                p.addDime();
            break;

            case 5:
                p.addQuarter();
            break;

            case 6:
                p.takeMoney();
            break;

            case 0:
                System.exit(0);
            break;

        }
    }
    while(choice != 0);
    userIn.close();
    }
}
