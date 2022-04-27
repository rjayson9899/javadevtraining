import java.util.Scanner;

public class ChapterSevenTimeCon {

    public static void convertDaystoHours(){
        int days;
        final int Hours = 24;

        Scanner userIn = new Scanner(System.in);

        System.out.println("Enter the number of days: ");
        days = userIn.nextInt();

        days = days*Hours;

        System.out.println(days);

    }

    public static void  convertHourstoMins(){

        int days;
        final int Hours = 24;

        Scanner userIn = new Scanner(System.in);

        System.out.println("Enter the number of days: ");
        days = userIn.nextInt();

        days = days*Hours;

        System.out.println(days);

    
    }

    public static void convertMinstoHours(){

        int days;
        final int Hours = 24;

        Scanner userIn = new Scanner(System.in);

        System.out.println("Enter the number of days: ");
        days = userIn.nextInt();

        days = days*Hours;

        System.out.println(days);

    
    }

    public static void convertHourstoDays(){

        int days;
        final int Hours = 24;

        Scanner userIn = new Scanner(System.in);

        System.out.println("Enter the number of days: ");
        days = userIn.nextInt();

        days = days*Hours;

        System.out.println(days);

    
    }


    public static void main(String[] args){
        int user;
        Scanner userIn = new Scanner(System.in);

        System.out.println("Enter what do you want to convert: ");
        System.out.println("1. days to hours ");
        System.out.println("2. hours to minutes ");
        System.out.println("3. minutes to hours ");
        System.out.println("4. hours to days ");
        user = userIn.nextInt();

        switch (user){
            case 1:
            convertDaystoHours();
            break;

            case 2:
            convertHourstoMins();
            break;

            case 3:
            convertMinstoHours();
            break;

            case 4:
            convertHourstoDays();
            break;
        }


        

        
    } 
 }