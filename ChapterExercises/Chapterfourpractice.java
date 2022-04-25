import java.util.Scanner;

public class Chapterfourpractice {

    public static void ChapterfourEone(){

        double finalheight;
        double userin;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a time less than 4.5 seconds: ");
        userin = input.nextDouble();
        input.close();
        finalheight = 100 - 4.9*Math.pow(userin,2);
        System.out.println("The height of the object is : " + finalheight);

    }

        public static void ChapterfourEtwo(){ 
    
        final double labor = 0.75;
        final double rent = 1;
        double diameter;
    
        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter the diameter of the pizza in inches: ");
        diameter = input.nextDouble();
        input.close();

        double mats = 0.05*diameter*diameter;
        double totalcost = labor + rent + mats;

        System.out.print("The cost of making the pizza is: " + totalcost);
        }


    public static void ChapterfourEfive(){
    
        final double light = 3.0*Math.pow(10,8);
        double m;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the mass of in kilograms: ");
        m = input.nextInt();

        double e = m*Math.pow(light,2);
        input.close();

        System.out.println("The energy produced in Joules is: " + e);

        double bulb = e / 360000;
        System.out.println("The number of 100-Watt light bulbs powered = " + bulb);


    }

    public static void ChapterfourEsix(){

        int total;
        int quarter;
        int dime;
        int nickel;
        int penny;
        Scanner cents = new Scanner(System.in);

        System.out.println("Enter the change  in cents: " );
        total = cents.nextInt();
        cents.close();

       
        quarter = total/25;
        total = total%25;

    
        dime = total/10;
        total = total%10;

   
        nickel = total/5;
        total = total%5;

        penny = total;


        System.out.println("The minimum number of coins is: ");
        System.out.println("Quarters: " + quarter);
        System.out.println("Dimes: " + dime);
        System.out.println("Nickels: " + nickel);
        System.out.println("Pennies: " + penny);
            
    }

    public static void ChapterfourEseven(){
        int numbers;
        int hundreds,tens,ones;
        Scanner user = new Scanner(System.in);
        System.out.println("Enter a three digit number: ");
        numbers = user.nextInt();
        user.close();
        hundreds = numbers/100;
        tens = numbers%100/10;
        ones = numbers%10;
        System.out.println("The hundereds place digit is: " + hundreds);
        System.out.println("The tens place digit is: " + tens);
        System.out.println("The ones place digit is: " + ones);

    }

    
 /*   public static void ChapterfourEnine){
    int time;

    }
    */

    
    public static void main(String[] args){ 
   ChapterfourEtwo();
}
}