package chapter8exer7;

import java.util.Random;

public class BowlGame extends Player {
    
    private int pins;
    private int thrower;

    public BowlGame(String name) {
        super(name);  
    }

    public int startFrame(){
        
       Random rand = new Random();
       pins = 10;
       thrower = 2;
       int checker = 0, pinsLeft = 0;

       while(thrower>0){

            
            if(thrower == 2){
                checker = rand.nextInt(10) + 1;
                pinsLeft = pins - checker;
            }

            else{
                checker = rand.nextInt(pinsLeft) + 1;
                pinsLeft -= checker;
            }
           
            if(pinsLeft == 0 && thrower == 2){
                return 20;
            }

            else if(pinsLeft <= 0 && thrower == 1){
                return 15;
            }

            thrower--;
       }

       if(pinsLeft < 0 ){
          return 0;
       }

       else{
           return 10 - pinsLeft;
       }

    }

}
