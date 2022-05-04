package ChapterEightExerciseThree;

public class food {
    
    double price;
    int fat;
    int carbs;
    int fiber;

    public food(double price, int fat, int carbs, int fiber) {
        this.price = price;
        this.fat = fat;
        this.carbs = carbs;
        this.fiber = fiber;
    }

    public double getPrice(){
        return price;
    }

    public int showFat(){
        return fat;
    }

    public int showCarbs(){
        return carbs;
    }

    public int showFiber(){
        return fiber;
    }
    
}
