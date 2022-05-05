package ProgrammingInJava.chapter8.exercise2;

public class Food{
    private double price;
    private double fat; 
    private double carbohydrates;
    private double fiber;

    public Food (double price, double fat, double carbohydrates, double fiber){
        this.price = price;
        this.fat = fat;
        this.carbohydrates = carbohydrates;
        this.fiber = fiber;
    }

    public double getPrice(){
        return(this.price);
    }

    public double getFat(){
        return(this.fat);
    }

    public double getCarbohydrates(){
        return(this.carbohydrates);
    }

    public double getFiber(){
        return(this.fiber);
    }
}