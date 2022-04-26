package chapter6exer;

import java.util.Scanner;

public class exer5 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int check;
        String inputNum;

        System.out.print("Enter a positive integer: ");
        check = input.nextInt();

        if(check>0){
            inputNum = Integer.toString(check);

        
            for(int x = 0; x < inputNum.length(); x++){
                System.out.println(inputNum.charAt(x)); 
            }

        }

        else{
            System.out.println("Input should be positive!");
        }
        

        input.close();
    }
}
