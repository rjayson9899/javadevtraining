package ProgrammingInJava.chapter8.exercise1;

import java.text.NumberFormat;

public class PiggyBank{
    private int penny;
    private int nickel;
    private int dime;
    private int quarter;

    public PiggyBank(){
        this.penny = 0;
        this.nickel = 0;
        this.dime = 0;
        this.quarter = 0;
    }

    public void addPenny(){
        this.penny += 1;
        System.out.println("Added a penny in the piggy bank.");
    }

    public void addNickel(){
        this.nickel += 1;
        System.out.println("Added a nickel in the piggy bank.");
    }

    public void addDime(){
        this.dime += 1;
        System.out.println("Added a dime in the piggy bank.");
    }

    public void addQuarter(){
        this.quarter += 1;
        System.out.println("Added a quarter in the piggy bank.");
    }

    public void convertCoinstoDollar(){
        Double totalValueofCoins = 0.0;
        NumberFormat money = NumberFormat.getCurrencyInstance();

        totalValueofCoins += (double)this.penny * 0.01;
        totalValueofCoins += (double)this.nickel * 0.05;
        totalValueofCoins += (double)this.dime * 0.10;
        totalValueofCoins += (double)this.quarter * 0.25;

        this.penny = 0;
        this.nickel = 0;
        this.dime = 0;
        this.quarter = 0;

        System.out.println("Total Value of Coins inside the piggy bank: " + money.format(totalValueofCoins));

    }

    public void displayTotalValue(){
        System.out.println("Total Penny inside the piggybank: " + this.penny);
        System.out.println("Total Nickel inside the piggybank: " + this.nickel);
        System.out.println("Total Dime inside the piggybank: " + this.dime);
        System.out.println("Total Quarter inside the piggybank: " + this.quarter);
    }
}