package chapter7exer;

import java.util.Scanner;

public class exer2 {
    
    public static Double inchtoCent(Double input){
        
        input = input * 2.54;

        return input;
    }

    public static Double feettoCent(Double input){
        
        input = input * 30;

        return input;
    }

    public static Double yardstoMet(Double input){
        
        input = input * 0.91;

        return input;
    }

    public static Double milestoKil(Double input){
        
        input = input * 1.6;

        return input;
    }

    public static Double centToInch(Double input){
        
        input = input / 2.54;

        return input;
    }

    public static Double metToYard(Double input){
        
        input = input / 0.91;

        return input;
    }

    public static Double KilToMiles(Double input){
        
        input = input / 1.6;

        return input;
    }

    public static Double centToFeet(Double input){
        
        input = input / 30;

        return input;
    }

    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        double number = 0;

        System.out.print("Enter a number: ");
        number = input.nextDouble();

        do{
        System.out.println("Convert: ");
        System.out.println( "1. Inches to Centimeters       5. Centimeters to Inches\n");
        System.out.println( "2. Feet to Centimeters         6. Centimeters to Feet\n");
        System.out.println( "3. Yards to Meters             7. Meters to Yards\n");
        System.out.println( "4. Miles to Kilometers         8. Kilometers to Miles\n");
        System.out.print("\n Enter your choice: ");
        choice = input.nextInt();
        

            switch(choice){

                case 1:
                    System.out.println(number + " inches equals " + inchtoCent(number) +" centimeters."); 
                    break;
                
                case 2:
                    System.out.println(number + " feet equals " + feettoCent(number) + " centimeters.");
                    break;

                case 3:
                    System.out.println(number + " yards equals " + yardstoMet(number) + " meters.");
                    break;

                case 4:
                    System.out.println(number + " miles equals " + milestoKil(number) + " kilometers.");
                    break;

                case 5:
                    System.out.println(number + " centimeters equals " + centToInch(number) + " inches.");
                    break;
                
                case 6:
                    System.out.println(number + " centimeter equals " + centToFeet(number) + " feet.");
                    break;

                case 7:
                    System.out.println(number + " meters equals " + metToYard(number) + " yards.");
                    break;
                
                case 8:
                    System.out.println(number + " kilometers equals " + KilToMiles(number) + " miles.");
                    break;
                
                default:
                    System.out.println("Wrong input!");
                    




            }

        }while(choice == 0);
       
        input.close();

        


    }
}
