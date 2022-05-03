package chapter9exer2;

import java.util.Scanner;

public class ClientApp {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        double withdrawal = 0 , deposit = 0;
        PersonalAcct personal = new PersonalAcct(50, "Mac" , "Isaac", "Taft", "Manila", "Manila" , "1004");
        BusinessAcct business = new BusinessAcct(550, "Kate" , "Isaac", "Wilma", "Tayabas", "Quezon" , "4301");
        
        do{
            System.out.println("\033[H\033[2J");
            System.out.println("Welcome to BDI banking!");
            System.out.println("-----------------------");
            System.out.println("       Main Menu       ");
            System.out.println("-----------------------");
            System.out.println("[1] Check balance");
            System.out.println("[2] Withdraw");
            System.out.println("[3] Deposit");
            System.out.println("[0] Exit");
            System.out.println("-----------------------");
            System.out.print("Your decision: ");
            choice = input.nextInt();

        
            switch(choice){
                case 1:
                    System.out.println("\033[H\033[2J");
                    System.out.println("What type of account? ");
                    System.out.println("[1] Personal Account");
                    System.out.println("[2] Business Account");
                    System.out.println("[3] Return to main menu");
                    System.out.println("-----------------------");
                    System.out.print("Your decision: ");
                    choice = input.nextInt();
                    if(choice == 1){
                    System.out.println("Info: ");
                    System.out.println(personal.toString());    
                    }
                        
                    
                    else if(choice == 2){
                    System.out.println("Info: ");
                    System.out.println(business.toString());
                        
                    }

                    System.out.print("Press any key to continue...");
                    input.next();

                    break;
                
                case 2:
                    System.out.println("\033[H\033[2J");
                    System.out.println("What type of account to withdraw? ");
                    System.out.println("[1] Personal Account");
                    System.out.println("[2] Business Account");
                    System.out.println("[3] Return to main menu");
                    System.out.println("-----------------------");
                    System.out.print("Your decision: ");
                    choice = input.nextInt();


                    if(choice == 1){
                        do{
                            System.out.print("amount to withdraw: ");
                            withdrawal = input.nextDouble();

                            if(withdrawal > personal.getBalance()){
                                System.out.println("Insufficient Balance");
                            }

                        }while(personal.getBalance() < withdrawal);

                        if(personal.getBalance() < 100){
                            System.out.println("Additional 2 dollars will be deducted due to low minimum balance.");
                            personal.withdrawal(withdrawal + 2);
                        }

                        else{
                            personal.withdrawal(withdrawal);
                        }
                        System.out.println("Your new balance is: " + personal.getBalance());
                
                        
                    }

                    else if(choice == 2){

                        do{
                            System.out.print("amount to withdraw: ");
                            withdrawal = input.nextDouble();

                            if(withdrawal > business.getBalance()){
                                System.out.println("Insufficient Balance");
                            }

                        }while(business.getBalance() < withdrawal);

                        if(business.getBalance() < 500){
                            System.out.println("Additional 10 dollars will be deducted due to low minimum balance.");
                            business.withdrawal(withdrawal + 10);
                        }

                        else{
                            business.withdrawal(withdrawal);
                        }
                        System.out.println("Your new balance is: " + business.getBalance());
                    }

                    System.out.print("Press any key to continue...");
                    input.next();

                    break;

                case 3:
                    System.out.println("\033[H\033[2J");
                    System.out.println("What type of account to deposit?");
                    System.out.println("[1] Personal Account");
                    System.out.println("[2] Business Account");
                    System.out.println("[3] Return to main menu");
                    System.out.println("-----------------------");
                    System.out.print("Your decision: ");
                    choice = input.nextInt();

                    if(choice == 1){
                        System.out.print("How much to deposit? ");
                        deposit = input.nextDouble();

                        personal.deposit(deposit);

                        System.out.println("Your new balance is: " + personal.getBalance());

                    }

                    else if(choice == 2){
                        System.out.print("How much to deposit? ");
                        deposit = input.nextDouble();

                        business.deposit(deposit);

                        System.out.println("Your new balance is: " + business.getBalance());
                    }

                    System.out.print("Press any key to continue...");
                    input.next();

                    break;
                
            }
        }while(choice != 0);

        input.close();
    }
}
