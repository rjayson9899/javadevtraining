package ProgrammingInJava.chapter7;

import java.util.Scanner;

public class MetricConversion {
    public static double convertInchestoCentimeters(double value){
        double valConverted;

        valConverted = (value * 2.54);
        return(valConverted);
    }

    public static double convertFeettoCentimeters(double value){
        double valConverted;

        valConverted = (value * 30.48);
        return(valConverted);
    }

    public static double convertYardstoMeters(double value){
        double valConverted;

        valConverted = (value * 0.91);
        return(valConverted);
    }

    public static double convertMilestoKilometers(double value){
        double valConverted;

        valConverted = (value * 1.6);
        return(valConverted);
    }

    public static double convertCentimeterstoInches(double value){
        double valConverted;

        valConverted = (value / 2.54);
        return(valConverted);
    }

    public static double convertCentimeterstoFeet(double value){
        double valConverted;

        valConverted = (value / 30);
        return(valConverted);
    }

    public static double convertMeterstoYards(double value){
        double valConverted;

        valConverted = (value / 0.91);
        return(valConverted);
    }

    public static double convertKilometerstoMiles(double value){
        double valConverted;

        valConverted = (value / 1.6);
        return(valConverted);
    }

    public static void main(String[] args) {
        int choice = 0;
        double getNumber;
        double value = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        getNumber = input.nextDouble();
    
        System.out.println("\nConvert: ");
        System.out.format("%-30s \t%s", "1. Inches to Centimeters ", "5. Centimeters to Inches \n");
        System.out.format("%-30s \t%s", "2. Feet to Centimeters ", "6. Centimeters to Feet\n");
        System.out.format("%-30s \t%s", "3. Yards to Meters ","7. Meters to Yards\n");
        System.out.format("%-30s \t%s", "4. Miles to Kilometers ", "8. Kilometers to Miles\n");

        System.out.print("\nEnter your choice: ");
        choice = input.nextInt();

        switch(choice){
            case 1:
                value = convertInchestoCentimeters(getNumber);
                break;
            case 2:
                value = convertFeettoCentimeters(getNumber);
                break;
            case 3:
                value = convertYardstoMeters(getNumber);
                break;
            case 4:
                value = convertMilestoKilometers(getNumber);
                break;
            case 5:
                value = convertCentimeterstoInches(getNumber);
                break;
            case 6:
                value = convertCentimeterstoFeet(getNumber);
                break;
            case 7:
                value = convertMeterstoYards(getNumber);
                break;
            case 8:
                value = convertKilometerstoMiles(getNumber);
                break;

            default:
                System.out.print("Enter a valid choice!\n");
                break;
        }
        input.close();
        System.out.print("Converted Value is: " + value);
    }
}