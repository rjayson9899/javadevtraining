package chapter10exer16;

public class Inventory {
  private int stockNum;
  private String name;
  private int amount;

  public Inventory(int stockNum, String name, int amount){
        this.stockNum = stockNum;
        this.name = name;
        this.amount = amount;
  }

  public void setStockNum(int number){
    this.stockNum = 1000 + number;
  }

  public void setAmount(int amount){
    this.amount += amount;
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
    System.out.println(stockNum + name + amount);
  }

  public void sellStock(int amount){
    this.amount -= amount;
  }

}
