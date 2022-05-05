package chapter10exer16;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Inventory> inventory = new ArrayList<>();
        int choice, amount, count = 0, index = 0;
        String name;


        do{
            System.out.print("\033[H\033[2J"); 
            System.out.flush();
            System.out.println("Welcome to Tobae's Sports Inventory!");
            System.out.println("------------------------------------");
            System.out.println("              Main Menu             ");
            System.out.println("------------------------------------");
            System.out.println("[1] Show all items                  ");
            System.out.println("[2] Add an item to the inventory    ");
            System.out.println("[3] Edit an item                    ");
            System.out.println("[4] Sell item                       ");
            System.out.println("[5] Add stock                       ");
            System.out.println("[6] discontinue an item             ");
            System.out.println("[0] Exit                            ");
            System.out.println("------------------------------------");
            System.out.print("Decision: ");
            choice = input.nextInt();
            input.nextLine();

            switch(choice){

                case 1:
                    System.out.print("\033[H\033[2J"); 
                    System.out.flush();

                    if(inventory.size() == 0){
                        System.out.println("Inventory Empty.");
                    }

                    else{
                        System.out.format("%-20s %-20s %-20s \n","Stock Number", "Name", "In stock");
                        for(int x = 0; x < inventory.size(); x++){
                            inventory.get(x).showInventory();
                        }
                    }

                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }

                    break;
                
                case 2:
                    System.out.print("\033[H\033[2J"); 
                    System.out.flush();

                    System.out.println("Input the item's: ");
                    System.out.print("Name: ");
                    name = input.nextLine();
                    System.out.print("Amount of stock: ");
                    amount = input.nextInt();
                    inventory.add(new Inventory(count,name,amount));
                    System.out.println("Successfully added!");
                    count++;

                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }

                    break;

                case 3:
                    System.out.print("\033[H\033[2J"); 
                    System.out.flush();

                    if(inventory.size() == 0){
                        System.out.println("Inventory Empty.");
                    }

                    else{
                        System.out.format("%-20s %-20s %-20s \n","Stock Number", "Name", "In stock");
                        for(int x = 0; x < inventory.size(); x++){
                            inventory.get(x).showInventory();
                        }
                        System.out.println("Select the stock number of the item you want to edit.");
                        System.out.print("stock number: ");
                        choice = input.nextInt();

                        for(int x = 0; x < inventory.size(); x++){

                            if(choice == inventory.get(x).getStockNum()){
                                index = x;
                                System.out.println("Which would you like to edit for " + inventory.get(x).getName() + "?"); 
                                System.out.println("[1] Name");
                                System.out.println("[2] Number of stock");
                                System.out.println("[3] Both");
                                System.out.println("[4] Return to main menu");
                                System.out.println("-----------------------");
                                System.out.print("choice: ");
                                choice = input.nextInt();
                                
                                
                                if(choice == 1){
                                        input.nextLine();
                                        System.out.print("change name of " + inventory.get(x).getName() + " to: " );
                                        name = input.nextLine();
                                        inventory.get(index).setName(name);
                                        System.out.println("Successfully edited!");
                                }

                                else if(choice == 2){
                                        System.out.print("change number of stock of " + inventory.get(x).getName() + " to: " );
                                        amount = input.nextInt();
                                        inventory.get(index).setAmount(amount);
                                        System.out.println("Successfully edited!");
                                }

                                else if(choice == 3){
                                        input.nextLine();
                                        System.out.print("change name of " + inventory.get(x).getName() + " to: " );
                                        name = input.nextLine();
                                        inventory.get(x).setName(name);

                                        System.out.print("change number of stock of " + inventory.get(x).getName() + " to: " );
                                        amount = input.nextInt();
                                        inventory.get(x).setAmount(amount);

                                        System.out.println("Successfully edited!");
                                }
                                break;
                            }
                            else if(x == inventory.size() - 1){
                                System.out.println("No item has this code.");
                            }
                        
                        }

                    
                    }

                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }

                    break;

                case 4:
                    System.out.print("\033[H\033[2J"); 
                    System.out.flush();

                    if(inventory.size() == 0){
                        System.out.println("Inventory Empty.");
                    }

                    else{
                        System.out.format("%-20s %-20s %-20s \n","Stock Number", "Name", "In stock");
                        for(int x = 0; x < inventory.size(); x++){
                            inventory.get(x).showInventory();
                        }
                        System.out.println("Select the stock number of the item you want to get.");
                        System.out.print("stock number: ");
                        choice = input.nextInt();
        
                        for(int x = 0; x < inventory.size(); x++){
                        if(choice == inventory.get(x).getStockNum()){
                            //index = x;
                            
                            do{
                                System.out.print("\033[H\033[2J"); 
                                System.out.flush();
                                System.out.println(inventory.get(x).getName() + " has " + inventory.get(x).getAmount());
                                System.out.println("How many would you like to get? ");
                                System.out.print("Amount: ");
                                amount = input.nextInt();
                                
                            
                                if(amount > inventory.get(x).getAmount()){
                                    System.out.println("Insufficient stock!");
                                }
                                else{
                                    inventory.get(x).sell(amount);
                                    System.out.println("Successfully sold!");
                                }

                                try {
                                    Thread.sleep(1500);
                                } catch (InterruptedException e) {
                                    // TODO Auto-generated catch block
                                    e.printStackTrace();
                                }

                            }while(amount > inventory.get(x).getAmount());
                            
                            break;
                        }
                        else if(x == inventory.size() - 1){
                            System.out.println("No item has this code.");
                        }
                        
                        }
                    }
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    break;

                case 5:
                    System.out.print("\033[H\033[2J"); 
                    System.out.flush();

                    if(inventory.size() == 0){
                        System.out.println("Inventory Empty.");
                    }

                    else{
                        System.out.format("%-20s %-20s %-20s \n","Stock Number", "Name", "In stock");
                        for(int x = 0; x < inventory.size(); x++){
                            inventory.get(x).showInventory();
                        }

                        System.out.println("Select the stock number of the item you want to add stock.");
                        System.out.print("stock number: ");
                        choice = input.nextInt();

                        for(int x = 0; x < inventory.size(); x++){
                            if(choice == inventory.get(x).getStockNum()){
                                System.out.println(inventory.get(x).getName() + " has " + inventory.get(x).getAmount());
                                System.out.println("How many would you like to add?");
                                System.out.print("amount: ");
                                amount = input.nextInt();
                                inventory.get(x).addAmount(amount);
                                System.out.println("Successfully added stock!");
                                break;
                            }

                            else if(x == inventory.size()-1){
                                System.out.println("No item has this code.");
                            }

                        }    
                    }

                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    break;
                
                case 6:
                    System.out.print("\033[H\033[2J"); 
                    System.out.flush();
                    String sure;

                    if(inventory.size() == 0){
                        System.out.println("Inventory Empty.");
                    }

                    else{
                        System.out.format("%-20s %-20s %-20s \n","Stock Number", "Name", "In stock");
                        for(int x = 0; x < inventory.size(); x++){
                            inventory.get(x).showInventory();
                        }

                        System.out.println("Select the item to discontinue.");
                        System.out.print("stock number: ");
                        choice = input.nextInt();

                        for(int x = 0; x < inventory.size(); x++){
                            if(choice == inventory.get(x).getStockNum()){
                                System.out.println("Are you sure you want to discontinue " + inventory.get(x).getName() + "?[y/n]");
                                input.nextLine();
                                sure = input.nextLine();
                                if(sure.charAt(0) == 'y' || sure.charAt(0) == 'Y'){
                                    inventory.get(x).Discont();
                                    System.out.println("Item successfully discontinued");
                                }
                                else{
                                    System.out.println("Discontinue cancelled!");
                                }
                                break;
                            }

                            else if(x == inventory.size() - 1){
                                System.out.println("No item has this code.");
                            }
                        }
                    }
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    break;
            }

        }while(choice != 0);
        input.close();
    }
}
