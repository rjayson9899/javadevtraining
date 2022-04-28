package ChapterEight.ChapterEightExerciseThree;
 import java.util.Scanner;

public class mainMenu {
    
    public static void main(String[] args){
        int choice;
        int numbHam,numbSal,numbFries,numbSoda;
        double totalHam,totalSal,totalFries,totalSoda;

        Scanner userIn = new Scanner(System.in);
        food hamburger = new food(1.85,9,33,1);
        food salad = new food(2,1,11,5);
        food fries = new food(1.30,11,36,4);
        food soda = new food(0.95,0,38,0);
    do{
        
        System.out.format("");
        System.out.println("2. Add a penny.");
        System.out.println("3. Add a nickel.");
        System.out.println("4. Add a dime.");
        System.out.println("5. Add a quarter.");
        System.out.println("6. Take money out of bank.");
        System.out.println("Enter 0 to quit.");
        
        System.out.println("Enter the number of hamburgers: ");
        numbHam = userIn.nextInt();
        System.out.println("Each hamburger has " + hamburger.showFat() + " of fat " + hamburger.showCarbs() + "" + hamburger.showFiber());
        totalHam = numbHam*hamburger.price;
        System.out.println("Enter the number of salads: ");
        numbSal = userIn.nextInt();
        System.out.println("Each salad has " + salad.showFat() + " of fat " + salad.showCarbs() + "" + salad.showFiber());
        totalSal = numbHam*salad.price;
        System.out.println("Enter the number of french fries: ");
        numbFries = userIn.nextInt();
        System.out.println("Each french fries has " + fries.showFat() + " of fat " + fries.showCarbs() + "" + fries.showFiber());
        totalFries = numbHam*fries.price;
        System.out.println("Enter the number of sodas: ");
        numbSoda = userIn.nextInt();
        System.out.println("Each sodas has " + soda.showFat() + " of fat " + soda.showCarbs() + "" + soda.showFiber());
        totalSoda = numbHam*soda.price;
    }
    while(choice != 0);
    userIn.close();
    }
}
