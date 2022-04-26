package chapter6exer;
import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {
        
        int counter = 2, inputNew;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input number: ");
        inputNew = input.nextInt();

        while(counter <= inputNew){
            if(inputNew % counter == 0){
                System.out.println(counter);
                inputNew = inputNew / counter;
            }
            else{
                counter++;
            }
        }
        input.close();

        
    }
}
