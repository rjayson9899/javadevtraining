package chapter3exer;

import java.util.Random;

public class exer1 {
    public static void main(String[] args) {
        Random r = new Random();
        
        for(int x = 0; x <= 5; x++){
            for(int y = 0; y <= 5; y++){
                if(x == 0){
                    if(y == 0){
                        System.out.format("%-8s","B");
                    }

                    else if(y == 1){
                        System.out.format("%-8s","I");
                    }

                    else if(y == 2){
                        System.out.format("%-8s",'N');
                    }

                    else if(y == 3){
                        System.out.format("%-8s",'G');
                    }

                    else if(y == 4){
                        System.out.format("%-8s",'O');
                    }

                }

              else if(x == 3 && y == 3){
                System.out.format("%-8s","FREE");
              }

                else if(y == 1){

                    System.out.format("%-8s",r.nextInt( 15 - 1 + 1) + 1);
                }

                else if(y == 2){

                    System.out.format("%-8s",r.nextInt( 30 - 16 + 1) + 16);
                }

                else if(y == 3){

                    System.out.format("%-8s",r.nextInt( 45 - 31 + 1) + 31);
                }

                else if(y == 4){

                    System.out.format("%-8s",r.nextInt( 60 - 46 + 1) + 46);
                }

                else if(y == 5){

                    System.out.format("%-8s",r.nextInt( 75 - 61 + 1) + 61);
                }

                
                
            }
            System.out.println("");
            }
        }
    
}

