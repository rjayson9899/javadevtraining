package chapter10exer16;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Inventory> inventory = new ArrayList<>();
        int choice, amount, count = 0;
        String name;


        System.out.print("\033[H\033[2J"); 
        System.out.flush();
        System.out.println("Welcome to Tobae's Sports Inventory!");
        System.out.println("------------------------------------");
        System.out.println("              Main Menu             ");
        System.out.println("------------------------------------");
        System.out.println("[1] Show all inventory              ");
        System.out.println("[2] Add an item to the inventory    ");
        System.out.println("[3] Remove stock                    ");
        System.out.println("[4] discontinue an item             ");
        System.out.println("[0]Exit                             ");
        System.out.println("------------------------------------");
        System.out.print("Decision: ");
        choice = input.nextInt();
        input.nextLine();

        switch(choice){

            case 1:
                if(inventory.size() == 0){
                    System.out.println("Inventory Empty.");
                }

                else{
                    for(int x = 0; x < inventory.size(); x++){
                        inventory.get(x).showInventory();
                    }
                }

                break;
            
            case 2:
                System.out.println("Input the item's: ");
                System.out.print("Name: ");
                name = input.nextLine();
                System.out.print("Amount of stock: ");
                amount = input.nextInt();
                inventory.add(new Inventory(count,name,amount));
                count++;

                break;




        }
        



        

    
    }
}
