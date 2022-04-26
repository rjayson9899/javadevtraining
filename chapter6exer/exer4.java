package chapter6exer;
import java.util.Scanner;

public class exer4 {
    public static void main(String[] args) {
        int[] defect = {119, 179, 189, 190, 191, 192, 193, 194, 195,221, 780};
        Scanner input = new Scanner(System.in);
        int model;
        boolean checker = true;

       
        do{
            
    
    
            System.out.print("Enter the car's model number: ");
            model = input.nextInt();
            
    
            for(int x=0; x<defect.length-1;x++){
                if(model == defect[x]){
                    System.out.println("Your car is defective. It must be repaired.");
                    checker = false;
                    break;
                }
            }
    
            if(checker == true){
                System.out.println("Your car is not defective.");
            }
        }while(model != 0);
            input.close();
    }
}
