import java.util.Scanner;
import java.text.NumberFormat;
public class ChapterSevenExerciseFive{

    public static String getDollarAmount(int penny, int nickels, int dimes, int quarters){
        final double quarter = .25;
        final double dime = .10;
        final double nickel = .05;
        final double pennies = .01;
        double total;

        NumberFormat F = NumberFormat.getCurrencyInstance();

        total = (penny*pennies)+(nickel*nickels)+(dime*dimes)+(quarter*quarters);
        return F.format(total);


    }
    public static void main(String[] args){

        int penny;
        int nickels;
        int dimes;
        int quarters;

        Scanner userIn = new Scanner(System.in);
        System.out.println("Enter your total coins: ");
        System.out.println("Quarters: ");
        quarters = userIn.nextInt();
        System.out.println("Dimes: ");
        dimes = userIn.nextInt();
        System.out.println("Nickels: ");
        nickels = userIn.nextInt();
        System.out.println("Pennies: ");
        penny = userIn.nextInt();

        getDollarAmount(penny,nickels,dimes,quarters);

        System.out.println(getDollarAmount(penny, nickels, dimes, quarters));
        
        
        userIn.close();
    }
}