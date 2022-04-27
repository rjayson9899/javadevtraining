package chapter6exer;
import java.util.Scanner;


public class exer6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ArrayList<Integer> expList = new ArrayList<Integer>();
        int check, sum = 0;
        String inputNum;

        System.out.print("Enter a positive integer: ");
        check = input.nextInt();

        if(check>0){
            inputNum = Integer.toString(check);
        
            for(int x = 0; x < inputNum.length(); x++){
                sum += Character.getNumericValue(inputNum.charAt(x));
                
            }

            System.out.println("The sum of all integers is: " + sum);


        }

        else{
            System.out.println("Input should be positive!");
        }
        

        input.close();
    }
    
}
