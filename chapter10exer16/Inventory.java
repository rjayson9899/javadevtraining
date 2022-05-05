package chapter10exer16;

public class Inventory {
  private int stockNum;
  private String name;
  private int amount;

  public Inventory(int stockNum, String name, int amount){
        this.stockNum = 1000 + stockNum;
        this.name = name;
        this.amount = amount;
  }

  public void setAmount(int amount){
    this.amount = amount;
  }

  public void addAmount(int amount){
    this.amount += amount;
  }

  public void sell(int amount){
    this.amount -= amount;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getName(){
      return name;
  }

  public int getStockNum(){
      return stockNum;
  }

  public int getAmount(){
      return amount;
  }

  public void Discont(){
    this.name = "Discontinued";
    this.amount = 0;
  }

  public void showInventory(){
    System.out.format("%-20s %-20s %-20s \n",stockNum, name, amount);
  }

  public void sellStock(int amount){
    this.amount -= amount;
  }

}
