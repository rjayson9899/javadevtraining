package numberCounts;
import java.util.Scanner;
import java.util.Random;

public class mains {
    public static void main(String[] args){
        int[] outcomes = new int[18];
        Scanner input = new Scanner(System.in);
        int numRolls;
        Random rand = new Random();
        int outcome;
        
        /* prompt user for number of rolls */
        System.out.print("How many rolls? ");
        numRolls = input.nextInt();
        
        /* roll dice and add to outcomes */
        for (int roll = 0; roll < numRolls; roll++) {
        outcome = ;
        outcomes[outcome] += 1;
        }
        
        /* show counts of outcomes */
        for (int i = 3; i <= 18; i++) {
        System.out.println(i + ": " + outcomes[i]);
        }
        input.close();
    }
}
    }
}
