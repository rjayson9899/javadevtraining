package chapter6exer;

public class exer3 {
    public static void main(String[] args) {
        
        double investment = 2500;
        double goal = 5000;
        double rate = 0.075;
        int years = 0;

        while(investment <= goal){
            investment = investment + (investment*rate);
            years++;
        }

        
        System.out.println("it will take " + years + " years");

    }


}
