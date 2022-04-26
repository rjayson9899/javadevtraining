package Exercises.chapterEight;

public class Food {
    private double price;
    private double fat;
    private double carbs;
    private double fiber;

    public Food (double prc, double ft, double crbs, double fib) {
        price = prc;
        fat = ft;
        carbs = crbs;
        fiber = fib;
    }

    public double getPrice() {
        return price;
    }

    public double getFat() {
        return fat;
    }

    public double getCarbs() {
        return carbs;
    }

    public double getFiber() {
        return fiber;
    }
}
