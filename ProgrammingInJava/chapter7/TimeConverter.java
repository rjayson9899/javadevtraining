package ProgrammingInJava.chapter7;

import java.util.Scanner;

public class TimeConverter{
    public static void convertHoursToMinutes() {
        double hours, minutes;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time in hours: ");
        hours = input.nextInt();
        input.close();

        minutes = hours * 60;
        System.out.print("The time in minutes is: " + minutes + " minutes");
    }

    public static void convertDaysToHours() {
        double days, hours;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time in days: ");
        days = input.nextInt();
        input.close();

        hours = days * 24;
        System.out.print("The time in hours is: " + hours + " hours");
    }

    public static void convertMinutesToHours() {
        double minutes, hours;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time in minutes: ");
        minutes = input.nextInt();
        input.close();

        hours = minutes / 60;
        System.out.print("The time in hours is: " + hours + " hours");
    }

    public static void convertHoursToDays() {
        double days, hours;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time in hours: ");
        hours = input.nextInt();
        input.close();

        days = hours / 24;
        System.out.print("The time in days is: " + days + " days");
    }

    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);

        System.out.println("Time Converter Program");
        System.out.println("1. Convert Hours to Minutes");
        System.out.println("2. Convert Days to Hours");
        System.out.println("3. Convert Minutes to Hours");
        System.out.println("4. Convert Hours to Days");
        System.out.print("Choice: ");
        choice = input.nextInt();

        switch(choice){
            case 1:
            convertHoursToMinutes();
            break;
            case 2:
            convertDaysToHours();
            break;
            case 3:
            convertMinutesToHours();
            break;
            case 4:
            convertHoursToDays();
            break;

            default:
            System.out.print("Enter a valid choice (1 - 4)");
            break;
        }
        input.close();
    }
}