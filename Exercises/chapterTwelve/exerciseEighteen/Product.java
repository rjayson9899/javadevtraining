package Exercises.chapterTwelve.exerciseEighteen;

public class Product {
    private int productID;
    private int stock;
    private String name;
    private boolean isDiscontinued;

    public Product(int productID, int stock, String name) {
        this.productID = productID;
        this.stock = stock;
        this.name = name;
        this.isDiscontinued = false;
    }

    /*
     * Returns stock quantity
     * pre: none
     * post: Stock quantity as integer
     */
    public int getStock() {
        return this.stock;
    }

    /*
     * Returns the Name of the Product
     * pre: none
     * post: Name as String
     */
    public String getName() {
        return this.name;
    }

    /*
     * Returns Product ID
     * pre: none
     * post: Product ID as int
     */
    public int getID() {
        return this.productID;
    }

    /*
     * Renames the product to discontinued
     * and sets stock quantity to 0.
     * Command will also change isDiscontinued flag
     * to true
     * pre: none
     * post: isDiscontinued flag set to true
     *       Name changed to discontinued
     *       Stock set to 0
     */
    public void discontinue() {
        if (isDiscontinued) {
            System.out.println("Product already discontinued");
        }
        else {
            this.name = "discontinued";
            this.stock = 0;
            this.isDiscontinued = true;
        }
    }

    /*
     * Adds value to stock and returns a status value
     * corresponding to outcome of the process
     * pre: none
     * post: -1 if isDiscontinued flag is true, stock is unchanged
     *       0 if input amount is negative or 0, stock is unchanged
     *       1 if input is a positive value, stock incremented by input amount
     */
    public int addStock(int amount) {
        if (isDiscontinued) {
            return -1;
        }
        else if (amount < 0 || amount == 0) {
            return 0;
        }
        else {
            this.stock += amount;
            return 1;
        }
    }

    /*
     * Reduces value of stock and returns a status value
     * corresponding to outcome of the process
     * pre: none
     * post: -1 if isDiscontinued flag is true, stock is unchanged
     *       0 if input amount is negative, 0, or above the value of current stock. Stock is unchanged
     *       1 if input is a positive value under current stock value, stock decremented by input amount
     */
    public int deductStock(int amount) {
        if (isDiscontinued) {
            return -1;
        }
        else if (amount > this.stock || amount <= 0) {
            return 0;
        }
        else {
            this.stock -= amount;
            return 1;
        }
    }
}
