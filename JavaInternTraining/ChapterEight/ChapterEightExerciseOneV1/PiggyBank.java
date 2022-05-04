package ChapterEightExerciseOneV1;

import java.util.Scanner;
public class PiggyBank {

    final double pRate = 0.01;
    final double dRate = 0.10;
    final double qRate = 0.25;
    final double nRate = 0.05;
    double balance;
    double cpenny;
    double cdime;
    double cquarter;
    double cnickel;

    Scanner userIn = new Scanner(System.in);

    public PiggyBank(){

    }
    
    public void showTotal(){

        System.out.println(this.balance);

    }

    public void addPenny(){

        System.out.println("Enter how many pennies: ");
        cpenny = userIn.nextDouble();

        this.balance += (cpenny*pRate);
        
    }

    public void addDime(){

        System.out.println("Enter how many dimes: ");
        cdime = userIn.nextDouble();

        this.balance += (cdime*dRate);
      
    }
    public void addQuarter(){

        System.out.println("Enter how many quarter: ");
        cquarter = userIn.nextDouble();

        this.balance += (cquarter*qRate);
        
    }

    public void addNickel(){

        System.out.println("Enter how many nickel: ");
        cnickel = userIn.nextDouble();

        this.balance += (cnickel*nRate);
        
    }

    public void takeMoney(){
        
        System.out.println("You have withdrew a total of " + balance);
        System.out.println("you have " + cpenny + " pennies");
        System.out.println("you have " + cdime + " dimes");
        System.out.println("you have " + cnickel + " nickels");
        System.out.println("you have " + cquarter + " quarters");
        this.balance -= balance;
    }

}
