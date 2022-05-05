package ProgrammingInJava.chapter9.exercise2;

public class PersonalAcct extends Account {
    
    public PersonalAcct(double balance, String firstName, String lastName, String street, String city, String state, String zip) {
        super(balance, firstName, lastName, street, city, state, zip);
    }

    public void minimumBalance() {
        if(super.getBalance() < 100){ 
            super.setBalance(super.getBalance() - 2);
            System.out.println("You have fallen below minimum balance of 100$\n A 2$ charge is withdrawn from the account.");
        }
    }
}
