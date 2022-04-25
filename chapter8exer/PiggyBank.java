package chapter8exer;

import java.text.NumberFormat;

public class PiggyBank {
    private int penny;
    private int nickel;
    private int dime;
    private int quarter;
    private double total;


    public PiggyBank(){

    }

    public void setPenny(int newPenny){
        this.penny += newPenny;
    }

    public void setNickel(int newNickel){
        this.nickel += newNickel;
    }

    public void setDime(int newDime){
        this.dime += newDime;
    }

    public void setQuarter(int newQuarter){
        this.quarter += newQuarter;
    }


    public void getTotal(){
        total = (penny * 0.01) + (nickel * 0.05) + (dime * 0.10) + (quarter * 0.25);
        NumberFormat money = NumberFormat.getCurrencyInstance();

        System.out.println("Your total is: " + money.format(total));
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void cashOut(){
        total = 0;
        quarter = 0;
        dime = 0;
        nickel = 0;
        penny = 0;
        System.out.println("Successfully cashed out! your total is now: " + total);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        
    }
}
