package chapter10exer12;


import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;



public class App {
    public static void main(String[] args) {
        GradeBook[] book = new GradeBook[12];
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int choice = 0, studentNum = 0;

        for(int x = 0; x < book.length; x++){
            int[][] a = {{x+1},{rand.nextInt(99 - 70) + 70,
                rand.nextInt(99 - 70) + 70,rand.nextInt(99 - 70) + 70,
                rand.nextInt(99 - 70) + 70,rand.nextInt(99 - 70) + 70}};
            book[x] = new GradeBook(a);
        }


        do{
            System.out.println("\033[H\033[2J");
            System.out.flush();
            System.out.println("------------------------------------");
            System.out.println("            Gradebook               ");
            System.out.println("------------------------------------");
            System.out.println("[1] Show test grade for student");
            System.out.println("[2] Show all grades for the class");
            System.out.println("[3] Show average grade of a student");
            System.out.println("[4] Show the test average for a test");
            System.out.println("------------------------------------");
            
            try {
                System.out.print("choice: ");
                choice = input.nextInt();    
            } 
            catch (InputMismatchException e) {
                input.next();
                choice = 7;

            }


        
            switch(choice){

                case 1: 
                    
                    try {
                        System.out.print("Input student number: ");
                        studentNum = input.nextInt();
                        book[studentNum - 1].showStudGrade(studentNum - 1);
                        pressAnyKeyToContinue();

                    } catch (Exception e) {
                        System.out.println("Wrong input!");
                        pressAnyKeyToContinue();
                    }
                    break;

                case 2:

                    for(int x = 0; x < book.length; x++){
                        book[x].showGrades();
                    }
                    pressAnyKeyToContinue();
                    break;

                case 3:
                    try {
                        System.out.print("Input student number: ");
                        studentNum = input.nextInt();
                        System.out.println(book[studentNum - 1].studentAvg(studentNum - 1));
                        pressAnyKeyToContinue();
                        
                    } catch (Exception e) {
                        System.out.println("Wrong input!");
                        pressAnyKeyToContinue();
                    }
                   
                    break;

                case 4:

                    System.out.print("Input student number: ");
                    studentNum = input.nextInt();
                    System.out.println(book[studentNum].testAvg(studentNum));
                    pressAnyKeyToContinue();
                    break;

            }
        }while(choice != 0);


       input.close();
    }

    private static void pressAnyKeyToContinue()
    { 
           System.out.println("Press Enter key to continue...");
           try
           {
               System.in.read();
           }  
           catch(Exception e)
           {}  
    }
}
