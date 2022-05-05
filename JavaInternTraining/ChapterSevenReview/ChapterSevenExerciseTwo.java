package ChapterSevenReview;
import java.util.Scanner;

public class ChapterSevenExerciseTwo {

    public static double convertInchToCenti(double cons, double input){
        input = cons * input;
        return input;
    }

    public static double convertFeetToCenti(double cons, double input){
        input = cons * input;
        return input;
    }

    public static double convertYardsToMeters(double cons, double input){
        input = cons * input;
        return input;
    }

    public static double convertMilesToKilometers(double cons, double input){
        input = cons * input;
        return input;
    }

    public static double convertCentiToInches(double cons, double input){
        input = cons * input;
        return input;
    }

    public static double convertCentiToFeet(double cons, double input){
        input = cons * input;
        return input;
    }

    public static double convertMetersToYards(double cons, double input){
        input = cons * input;
        return input;
    }

    public static double convertKilometersToMiles(double cons, double input){
        input = cons * input;
        return input;
    }

    public static void main(String[] args){
        double user;
        int choice;
        double ans;
        final double inch = 2.54;
        final double feet = 30;
        final double yards = 0.91;
        final double miles = 1.6;

        Scanner userIn = new Scanner(System.in);

        System.out.println("Enter a number: ");
        user = userIn.nextDouble();
        System.out.println("\nConvert: ");
        System.out.println("1. Inches to Centimeters       5. Centimeters to Inches");
        System.out.println("2. Feet to Centimeters         6. Centimeters to Feet");
        System.out.println("3. Yards to Meters             7. Meters to Yards");
        System.out.println("4. Miles to Kilometers         8. Kilometers to Miles \n");
        System.out.println("Enter your choice: ");
        choice = userIn.nextInt();

        switch(choice){

            case 1:
            ans = convertInchToCenti(inch,user);
            System.out.println(ans);
            break;

            case 2:
            ans = convertFeetToCenti(feet,user);
            System.out.println(ans);
            break;

            case 3:
            ans = convertYardsToMeters(yards,user);
            System.out.println(ans);
            break;
            
            case 4:
            ans = convertMilesToKilometers(miles,user);
            System.out.println(ans);
            break;

            case 5:
            ans = convertCentiToInches(1/inch,user);
            System.out.println(ans);
            break;

            case 6:
            ans = convertCentiToFeet(1/feet,user);
            System.out.println(ans);
            break;

            case 7:
            ans = convertMetersToYards(1/yards,user);
            System.out.println(ans);
            break;

            case 8:
            ans = convertKilometersToMiles(1/miles,user);
            System.out.println(ans);
            break;

        }  
        userIn.close(); 
    }
}
