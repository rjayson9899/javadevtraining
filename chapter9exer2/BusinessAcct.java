package chapter9exer2;

public class BusinessAcct extends Account {

    public BusinessAcct(double bal, String fName, String lName, String str, String city, String st, String zip) {
        super(bal, fName, lName, str, city, st, zip);
        //TODO Auto-generated constructor stub
    }

    public void minimum(){
        if(this.getBalance() < 500){
            this.setBalance(this.getBalance() - 10);
        }
    }
    
}
