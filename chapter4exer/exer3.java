package chapter4exer;

import java.util.ArrayList;
import java.util.Scanner;

public class exer3 {
    public static void main(String[] args) {
        String [] expenses = {"Tuition" , "Transportation", "Food", "Materials & books" , "others" };
        String [] offset = {"Scholarship", "Allowance", "others"};
        ArrayList<Double> expList = new ArrayList<Double>();
        ArrayList<Double> offList = new ArrayList<Double>();
        double expTotal = 0;
        double offTotal =0;
        

        Scanner input = new Scanner(System.in);
        

        System.out.println("Welcome to your CollegeCalculator!");
        System.out.println("Input your expenses for: ");

        for(int x = 0; x < expenses.length; x++){
            
            System.out.print(expenses[x] + ": " );
            expList.add(input.nextDouble());
            expTotal = expTotal + expList.get(x);
        }

        System.out.println("Your total for expenses is: " + expTotal);

        System.out.println("Input your offsets for: ");

        for(int x = 0; x < offset.length; x++){
            
            System.out.print(offset[x] + ": " );
            offList.add(input.nextDouble());
            offTotal = offTotal + offList.get(x);
        }

        System.out.println("Your total for offset is: " + offTotal);

        System.out.println("Your total expense with offset is: " + (expTotal - offTotal));

        input.close();


    }
}
