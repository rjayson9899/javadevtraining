package chapter8exer3;

public class Food {
    private double price;
    private double fat;
    private double carbs;
    private double fiber;
    

    public Food(double priceInput, double fatInput, double carbsInput, double fiberInput){
        this.price = priceInput;
        this.fat = fatInput;
        this.carbs = carbsInput;
        this.fiber = fiberInput;
    }


    public double getPrice(){
        return price;
    }

    public double getFat(){
        return fat;
    }

    public double getCarbs(){
        return carbs;
    }

    public double getFiber(){
        return fiber;
    }

    
}

