package JavaInternTraining;
/* 
This program was developed by Macario Peralta V.
The following are the review programs that were in 
the fifth chapter of the assigned reading material.
*/

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Random;
import java.lang.Math;

public class ChapterFiveExercise {

    //This program gets the wave size.
    public static void runReviewSurfUp(){

        double waveHeight;

        Scanner userIn = new Scanner(System.in);
   
        do {
            System.out.println("Please input the wave height: ");
            waveHeight = userIn.nextInt();


            if (waveHeight >= 6){
                System.out.println("Great day for surfing!");
            }
            else if ( waveHeight < 6 && waveHeight >= 3) {
                System.out.println("Go for a swim");
            } 
            else if ( waveHeight <= 3 && waveHeight >= 0 ) {
                System.out.println("Whoa! what kind of surfing is that? ");
            } 
        } while (waveHeight > 0);
        userIn.close();

    }

    //this program gets the user's age.
    public static void runReviewStages(){

        int age;
        Scanner userIn = new Scanner(System.in);

        do {
            System.out.println("Please input your age: ");
            age = userIn.nextInt();

            if (age <= 5){
                System.out.println("Toddler");
            }
            else if (age <= 10){
                System.out.println("Child");
            }
            else if (age <= 12){
                System.out.println("Pre-teen");
            }
            else if (age <= 18){
                System.out.println("Teen");
            }
            else if (age > 18){
                System.out.println("Adult");
            }
        } while (age > 0);
        userIn.close();
    }

    //this program calculates for the rates of the photocopier.
    public static void runExerciseOne(){

        int copy;
        double total;

        NumberFormat money = NumberFormat.getCurrencyInstance();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of copies to be priced: ");
        copy = input.nextInt();
        
        if (copy <= 99){
            System.out.println("Price per copy is: $.30");
            total = copy*0.30;
            System.out.println("Total cost is: " + money.format(total));
        }
        else if (copy >= 100 && copy <= 499){
            System.out.println("Price per copy is: $0.28");
            total = copy*0.28;
            System.out.println("Total cost is: " + money.format(total));
        }
        else if (copy >= 500 && copy <= 749){
            System.out.println("Price per copy is: $0.27");
            total = copy*0.27;
            System.out.println("Total cost is: " + money.format(total));   
        }
        else if (copy >= 750 && copy <= 1000){
            System.out.println("Price per copy is: $0.26");
            total = copy*0.26;
            System.out.println("Total cost is: " + money.format(total));
        }
        else if (copy >= 1000){
            System.out.println("Price per copy is: $0.25");
            total = copy*0.25;
            System.out.println("Total cost is: " + money.format(total));
        }
        input.close();
    }

    // this program judges the users package if it is eligible for transport.
    public static void runExerciseTwo(){

        double weight, width, height, length, total;

        Scanner user = new Scanner (System.in);

        System.out.println("Enter the package weight in kilograms: ");
        weight = user.nextDouble();
        System.out.println("Enter the package length in centimeters: ");
        length = user.nextDouble();
        System.out.println("Enter the package width in centimeters: ");
        width = user.nextDouble();
        System.out.println("Enter the package height in centimeters: ");
        height = user.nextDouble();
        total = length*width*height;

        if (weight > 27){
            System.out.println("Too heavy");
        }
        else if (total > 100000){
            System.out.println("Too large");
        }
        else if (weight > 27 && total > 100000){
            System.out.println("Too heavy and Too large");
        }
        else {
            System.out.println("Your package is accepted.");
        }
        user.close();
    }

    // this program calculates for the rates of an egg store.
    public static void runExerciseThree(){

        int eggs;
        double bill, rates;

        //Objects
        Scanner input = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();

        System.out.println("Enter the number of eggs purchased: ");
        eggs = input.nextInt();
        input.close();

        if (eggs >= 0 && eggs <= 47){

            rates = 0.50/12;
            bill = eggs*rates;
            System.out.println("The bill is equal to: " + money.format(bill));
        }
        else if (eggs >= 48 && eggs <= 71){
            rates = 0.45/12;
            bill = eggs*rates;
            System.out.println("The bill is equal to: " + money.format(bill));
        }
        else if (eggs >= 72 && eggs <= 131){
            rates = 0.40/12;
            bill = eggs*rates;
            System.out.println("The bill is equal to: " + money.format(bill));
        }
        else if (eggs >= 132){
            rates = 0.35/12;
            bill = eggs*rates;
            System.out.println("The bill is equal to: " + money.format(bill));
        }
      }

    //this program is checks if the car model is defective.
    public static void runExerciseFour(){

        int carModel;

        Scanner customer = new Scanner(System.in);

        System.out.println("Enter the car's model number: ");
        carModel = customer.nextInt();
        customer.close();
        switch(carModel){
            case 119: 
                System.out.println("Your car is defective. It must be repaired."); 
                break;
            case 179: 

            case 189: 
      
            case 190: 
          
            case 191: 
              
            case 192: 
               
            case 193: 
            
            case 194: 
            
            case 195: 

            case 221: 

            case 780: 
                System.out.println("Your car is defective. It must be repaired."); 
                break;
            default:
                System.out.println("Your car is not defective.");
        }
       
    }  

    // this program calculates for the percentage and the corresponding letter grade.
    public static void runExerciseFive(){
        double percent;

        Scanner userIn = new Scanner (System.in);

        System.out.println("Enter the percentage: ");
        percent = userIn.nextDouble();

        if (percent < 60){
            System.out.println("The corresponding letter grade is: F");
        }
        else if (percent >= 60 && percent < 70){
            System.out.println("The corresponding letter grade is: D");
        }
        else if (percent >=70 && percent < 80){
            System.out.println("The corresponding letter grade is: C");
        }
        else if (percent >= 80 && percent < 90){
            System.out.println("The corresponding letter grade is: B");
        }
        else if (percent >= 90 && percent <= 100){
            System.out.println("The corresponding letter grade is: A");
        }
        userIn.close();
    }

    //this program randomly generates 2 numbers and operation and checks the user's answer.
    public static void runExerciseSix(){

        int input,randsone,randstwo,randstotal = 0,op;
        Scanner userin = new Scanner(System.in);
        Random r = new Random();
        randsone = r.nextInt(10);
        randstwo = r.nextInt(10);
        op = r.nextInt(3);
        switch (op){
            case 0:
            System.out.println("What is " + randsone + " + " + randstwo + "?" );
            randstotal = randsone + randstwo;
            break;

            case 1:
            System.out.println("What is " + randsone + " - " + randstwo + "?" );
            randstotal = randsone - randstwo;
            break;

            case 2:
            System.out.println("What is " + randsone + " * " + randstwo + "?" );
            randstotal = randsone * randstwo;
            break;
            
            case 3:
            System.out.println("What is " + randsone + " / " + randstwo + "?" );
            randstotal = randsone / randstwo;
            break;
        }

        input = userin.nextInt();
        userin.close();

        if (input == randstotal){
            System.out.println("You got it");
        }
        else {
            System.out.println("What" + randstotal);
        } 

    }

    //this program is a guessing game.
    public static void runExerciseNine(){
        
        int player;
        int comp;
  
        Scanner userIn = new Scanner(System.in);
        Random rancomp = new Random();

        comp = rancomp.nextInt(21);
        System.out.println("Enter a number between 1 and 20: ");
        player = userIn.nextInt();
        userIn.close();
        System.out.println("Computer's Number: " + comp);
        System.out.println("Player's number: " + player);
        if (player == comp){
            System.out.println("You Won!");
        }
        else {
            System.out.println("Better luck next time. ");
        }
    }

    //this program calculates for the half-life of a bio-material.
    public static void runExerciseFifthteen(){
        int choice;
        double initial,finalOne,timeOne,constant,total;
                 
        Scanner userIn = new Scanner(System.in);

        System.out.println("1. Final amount");
        System.out.println("2. Initial amount");
        System.out.println("3. Constant <half-life>");
        System.out.println("Find: ");
        choice = userIn.nextInt();

        switch(choice){

            case 1:

                System.out.println("Enter initial mass: ");
                initial = userIn.nextDouble();
                System.out.println("Enter elaspse time in years: ");
                timeOne = userIn.nextDouble();
                System.out.println("Constant <half-life>:");
                constant = userIn.nextDouble();
                total = initial*Math.exp(constant*timeOne);
                System.out.println("Final mass:" + total);
                break;

            case 2:

                System.out.println("Enter final mass: ");
                finalOne = userIn.nextDouble();
                System.out.println("Enter elaspse time in years: ");
                timeOne = userIn.nextDouble();
                System.out.println("Constant <half-life>:");
                constant = userIn.nextDouble();
                total = finalOne/Math.exp(constant*timeOne);
                System.out.println("Initial mass: " + total);
                break;

            case 3: 

                System.out.println("Enter initial mass: ");
                initial = userIn.nextDouble();
                System.out.println("Enter final mass: ");
                finalOne = userIn.nextDouble();
                System.out.println("Enter elaspse time in years: ");
                timeOne = userIn.nextDouble();
                total = Math.log(finalOne/initial)/timeOne;
                System.out.println("Constant <half-life>: " + total);
                break;
        }
        userIn.close();
    }

    //this program calculates for the trigonometric functions of the user inputted degree
    public static void runExerciseSixteen(){
        double angle;
        double cos,sin,tan;

        Scanner userIn = new Scanner(System.in);

        System.out.print("Enter an angle in degrees: ");
        angle = userIn.nextDouble();
        angle = Math.toRadians(angle);
        userIn.close();
        sin = Math.sin(angle);
        cos = Math.cos(angle);
        tan = Math.tan(angle);

        System.out.println("Arcsin: " + sin);
        System.out.println("Arccos: " + cos);
        System.out.println("Arctan: " + tan);
    } 

    // this program is similar to the previous one except using inverse functions.
    public static void runExerciseSeventeen(){
        double angle;
        double asin,acos,atan;

        Scanner userIn = new Scanner(System.in);

        System.out.print("Enter an angle in degrees: ");
        angle = userIn.nextDouble();
        angle = Math.toRadians(angle);
        userIn.close();
        asin = Math.asin(angle);
        acos = Math.acos(angle);
        atan = Math.atan(angle);

        System.out.println("Arcsin: " + asin);
        System.out.println("Arccos: " + acos);
        System.out.println("Arctan: " + atan);
    }

    public static void main(String[] args){
        int choice;

        Scanner userIn = new Scanner(System.in);

        System.out.println("Please choose what exercise: ");
        System.out.println("1. Surf Up ");
        System.out.println("2. Stages ");
        System.out.println("3. Exercise One ");
        System.out.println("4. Exercise Two ");
        System.out.println("5. Exercise Three ");
        System.out.println("6. Exercise Four ");
        System.out.println("7. Exercise Five ");
        System.out.println("8. Exercise Six");
        System.out.println("9. Exercise Nine ");
        System.out.println("10. Exercise Fifthteen ");
        System.out.println("11. Exercise Sixteen ");
        System.out.println("12. Exercise Seventeen" );
        choice = userIn.nextInt();

        switch(choice){

            case 1:
            runReviewSurfUp();
            break;

            case 2:
            runReviewStages();
            break;

            case 3:
            runExerciseOne();
            break;

            case 4:
            runExerciseTwo();
            break;

            case 5:
            runExerciseThree();
            break;

            case 6:
            runExerciseFour();
            break;

            case 7:
            runExerciseFive();
            break;

            case 8:
            runExerciseSix();
            break;

            case 9:
            runExerciseNine();
            break;

            case 10:
            runExerciseFifthteen();
            break;

            case 11:
            runExerciseSixteen();
            break;

            case 12:
            runExerciseSeventeen();
            break;

        }
        runExerciseFifthteen();
        userIn.close();
    }
}
