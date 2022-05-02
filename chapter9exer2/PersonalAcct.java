package chapter9exer2;

public class PersonalAcct extends Account {

    
    public PersonalAcct(double bal, String fName, String lName, String str, String city, String st, String zip) {
        super(bal, fName, lName, str, city, st, zip);
        //TODO Auto-generated constructor stub
    }

    public void minimum(){
        if(this.getBalance() < 100){
            this.setBalance(this.getBalance() - 2);
        }
    }
}
