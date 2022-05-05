package Exercises.chapterTwelve.exerciseEighteen;

public class Product {
    private int stockID;
    private int stock;
    private String name;
    private boolean isDiscontinued;

    public Product(int stockID, int stock, String name) {
        this.stockID = stockID;
        this.stock = stock;
        this.name = name;
        this.isDiscontinued = false;
    }

    public int getStock() {
        return this.stock;
    }

    public String getName() {
        return this.name;
    }

    public int getID() {
        return this.stockID;
    }

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
