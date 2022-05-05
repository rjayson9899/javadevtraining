package ProgrammingInJava.chapter9.exercise2;

public class BusinessAcct extends Account {

    public BusinessAcct(double balance, String firstName, String lastName, String street, String city, String state, String zip){
        super(balance, firstName, lastName, street, city, state, zip);
    }

    public void minimumBalance(){
        if(super.getBalance() < 500){ 
            super.setBalance(super.getBalance() - 10);
            System.out.println("You have fallen below minimum balance of 500$\n A 10$ charge is withdrawn from the account.");
        } 
    }
    
}
