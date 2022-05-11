package numberCounts;
import java.util.Scanner;

public class mains {
    public static void main(String[] args){
        int[] outcomes = new int[10];
        //char[] ref = {'0','1','2','3','4','5','6','7','8','9'};
        Scanner input = new Scanner(System.in);
        String digit;
        int outcome;
        char[] wordLetters;

        /* prompt user for number of rolls */
        System.out.print("Enter the digit: ");
        digit = input.nextLine();
        //input.nextLine();
        /* roll dice and add to outcomes */
        wordLetters = digit.toCharArray();
        System.out.println(wordLetters);
        for (int roll = 0; roll < wordLetters.length; roll++) {
            outcome = Character.getNumericValue(wordLetters[roll]);
            for (int x = 0; x <= 9; x++){
                if (outcome == x) {
                    outcomes[outcome] += 1;
                }
            }
        }
        /* show counts of outcomes */
        for (int i = 0; i <= 9; i++) {
        System.out.println(i + ": " + outcomes[i]);
        }
        input.close();
    }
}
