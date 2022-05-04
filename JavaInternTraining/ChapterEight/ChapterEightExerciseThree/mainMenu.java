package ChapterEightExerciseThree;
 import java.util.Scanner;

public class mainMenu {
    
    public static void main(String[] args){
      //  int choice;
        int numbHam,numbSal,numbFries,numbSoda;
        double total,totalHam,totalSal,totalFries,totalSoda;

        Scanner userIn = new Scanner(System.in);
        food hamburger = new food(1.85,9,33,1);
        food salad = new food(2,1,11,5);
        food fries = new food(1.30,11,36,4);
        food soda = new food(0.95,0,38,0);
  //  do{
        
        System.out.format("%7s %12s %10s %18s %12s",  " Item", " price", "Fat(g)", "Carbohydrates(g)", "Fiber(g)\n");
        System.out.format("%10s %9s %7s %12s %15s", "hamburger", "$1.85", "9", "33", "1\n");
        System.out.format("%7s %12s %7s %12s %15s", "salad", "$2.00", "1", "11","5\n");
        System.out.format("%10s %8s %7s %12s %15s", "frech fries", "$1.30", "11", "36", "4\n");
        System.out.format("%7.5s %12s %7s %12s %15s", "soda", "$0.95", "0", "38", "0\n");
        System.out.println("Enter 0 to quit.");
        
        System.out.println("Enter the number of hamburgers: ");
        numbHam = userIn.nextInt();
        System.out.println("Each hamburger has " + hamburger.showFat() + "g of fat, " + hamburger.showCarbs() + "g of carbs, and " + hamburger.showFiber() + "g of fiber.");
        totalHam = numbHam*hamburger.price;
        System.out.println("Enter the number of salads: ");
        numbSal = userIn.nextInt();
        System.out.println("Each salad has " + salad.showFat() + "g of fat, " + salad.showCarbs() + "g of carbs, and " + salad.showFiber() + "g of fiber.");
        totalSal = numbSal*salad.price;
        System.out.println("Enter the number of french fries: ");
        numbFries = userIn.nextInt();
        System.out.println("Each french fries has " + fries.showFat() + "g of fat, " + fries.showCarbs() + "g of carbs, and " + fries.showFiber() + "g of fiber.");
        totalFries = numbFries*fries.price;
        System.out.println("Enter the number of sodas: ");
        numbSoda = userIn.nextInt();
        System.out.println("Each sodas has " + soda.showFat() + "g of fat, " + soda.showCarbs() + "g of carbs, and " + soda.showFiber() + "g of fiber.");
        totalSoda = numbSoda*soda.price;

        total = totalHam + totalSal + totalFries + totalSoda;
        System.out.println("Your order comes to: $" + total);

  //  }
    //while(choice != 0);
    userIn.close();
    }
}
