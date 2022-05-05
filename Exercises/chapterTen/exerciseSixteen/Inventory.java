package Exercises.chapterTen.exerciseSixteen;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
    private static void printInventory(ArrayList<Product> catalogue) {
        System.out.format("%4s\t%20s\t%20s\n", "ID", "Product Name", "Amount in Stock");
        for (Product item: catalogue) {
            System.out.format("%4s\t%20s\t%20s\n", item.getID(), item.getName(), item.getStock());
        }
    }

    private static int searchInventory(ArrayList<Product> catalogue, int stockID) {
        int index = 0;
        int foundID;

        do {
            foundID = catalogue.get(index).getID();
            index++;
        } while ((foundID != stockID) && (index < catalogue.size()));

        if (foundID == stockID) {
            return (index - 1);
        }
        else {
            return -1;
        }
    }

    public static void main(String[] args) {
        ArrayList<Product> catalogue = new ArrayList<Product>();
        Scanner in = new Scanner(System.in);
        int oper, amount, stockID, get, index, status;
        String getName;

        do {
            System.out.print("\033[H\033[2J");
            System.out.println("1. Add product");
            System.out.println("2. Discontinue product");
            System.out.println("3. View Stock");
            System.out.println("4. Add Stock");
            System.out.println("5. Remove Stock");
            System.out.print("Enter your choice (0 to quit): ");
            oper = in.nextInt();
            in.nextLine();

            switch(oper) {
                case 1:
                    System.out.print("Enter product name: ");
                    getName = in.nextLine();
                    System.out.print("Enter initial stock amount: ");
                    amount = in.nextInt();
                    in.nextLine();
                    stockID = catalogue.size() + 1000;
                    catalogue.add(new Product(stockID, amount, getName));
                    break;

                case 2:
                    if (catalogue.size() == 0) {
                        System.out.println("No items in inventory");
                    }
                    else {
                        printInventory(catalogue);
                        System.out.print("Enter stock number of item to discontinue: ");
                        get = in.nextInt();
                        in.nextLine();
                        index = searchInventory(catalogue, get);
                        if (index == -1) {
                            System.out.println("No matching product found");
                        }
                        else {
                            catalogue.get(index).discontinue();
                        }
                    }
                    break;

                case 3:
                    if (catalogue.size() == 0) {
                        System.out.println("No items in inventory");
                    }
                    else {
                        printInventory(catalogue);
                    }
                    break;

                case 4:
                    if (catalogue.size() == 0) {
                        System.out.println("No items in inventory");
                    }
                    else {
                        printInventory(catalogue);
                        System.out.print("Enter stock number of item to add: ");
                        get = in.nextInt();
                        in.nextLine();
                        index = searchInventory(catalogue, get);
                        if (index == -1) {
                            System.out.println("No matching product found");
                        }
                        else {
                            System.out.print("[" + catalogue.get(index).getName() + "] Enter how much to add: ");
                            amount = in.nextInt();
                            in.nextLine();
                            status = catalogue.get(index).addStock(amount);
                            if (status == -1) {
                                System.out.println("Item is discontinued. Operation aborted.");
                            }
                            else if (status == 0) {
                                System.out.println("Invalid amount, enter positive non-zero values only");
                            }
                            else {
                                System.out.println("Stock increased successfully");
                            }
                        }
                    }
                    break;

                case 5:
                    if (catalogue.size() == 0) {
                        System.out.println("No items in inventory");
                    }
                    else {
                        printInventory(catalogue);
                        System.out.print("Enter stock number of item to deduct: ");
                        get = in.nextInt();
                        in.nextLine();
                        index = searchInventory(catalogue, get);
                        if (index == -1) {
                            System.out.println("No matching product found");
                        }
                        else {
                            System.out.print("[" + catalogue.get(index).getName() + "] Enter how much to deduct: ");
                            amount = in.nextInt();
                            in.nextLine();
                            status = catalogue.get(index).deductStock(amount);
                            if (status == -1) {
                                System.out.println("Item is discontinued. Operation aborted.");
                            }
                            else if (status == 0) {
                                System.out.println("Invalid amount, enter positive non-zero values within range only");
                            }
                            else {
                                System.out.println("Stock decreased successfully");
                            }
                        }
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Input");
            }

            System.out.println("Press any key to continue...");
            in.nextLine();

        } while (oper != 0);

        in.close();
    }
}
