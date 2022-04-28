package ChapterEight.ChapterEightExerciseOne;

import java.util.Scanner;
public class PiggyBank {

    final double pRate = 0.01;
    final double dRate = 0.10;
    double qRate = 0.25;
    double nRate = 0.05;
    double balance;

    Scanner userIn = new Scanner(System.in);

    public PiggyBank(){

    }

    public void setBalance(){

    }
    
    public void showTotal(){

        printbalance();
    }

    public void addPenny(){
        double newbalance;

        System.out.println("Enter how many pennies: ");
        newbalance = userIn.nextDouble();

        this.balance += (newbalance*pRate);
        System.out.println(balance);
        
        printbalance();
    }

    public double addDime(){
        double newbalance;
        newbalance = userIn.nextDouble();

        this.balance += (newbalance*dRate);

        return balance;
        
    }
    public double addQuarter(){
        double newbalance;
        newbalance = userIn.nextDouble();

        this.balance += (newbalance*qRate);

        return balance;
        
    }

    public double addNickel(){
        double newbalance;
        newbalance = userIn.nextDouble();

        this.balance += (newbalance*nRate);

        return balance;
        
    }


    public int takeMoney(){
        return 0;
    }


    private void printbalance(){
        System.out.println(this.balance);
    }

}
