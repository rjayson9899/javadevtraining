/*
 * Made by: Roger Jayson M. Mendez III
 * On: 4/27/22
 * This exercise aims to create lunch ordering app that accepts
 * user input on how much of a certain food product they want to
 * buy. This class file serves to represent each food product 
 * in the lunch order app. The key characteristics desired by the 
 * exercise instructions is for the ability for a food object to
 * store data regarding its price, fat, carbs, and fiber. Since the
 * exercise did not dictate that the class needs to have methods to
 * modify variables, no such methods were implemented. Instead, only
 * methods to get the values from the class are implemented.
 */
package Exercises.chapterEight.exerciseThree;

public class Food {
    private double price;
    private double fat;
    private double carbs;
    private double fiber;

    /*
     * Creates a food instance with price, fat, carbs, and fiber
     * variables bearing the same values as the ones provided in 
     * the parameters
     * pre: none
     * post: Food object instantiated with set values
     */
    public Food (double price, double fat, double carbs, double fiber) {
        this.price = price;
        this.fat = fat;
        this.carbs = carbs;
        this.fiber = fiber;
    }

    /*
     * Returns value of price variable
     * pre: none
     * post: Price value as double
     */
    public double getPrice() {
        return this.price;
    }

    /*
     * Returns value of fat variable
     * pre: none
     * post: Fat value as double
     */
    public double getFat() {
        return this.fat;
    }

    /*
     * Returns value of carbs variable
     * pre: none
     * post: Carbs value as double
     */
    public double getCarbs() {
        return this.carbs;
    }

    /*
     * Returns value of fiber variable
     * pre: none
     * post: Fiber value as double
     */
    public double getFiber() {
        return this.fiber;
    }
}
