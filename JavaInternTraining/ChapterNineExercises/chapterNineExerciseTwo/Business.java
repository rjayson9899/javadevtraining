package chapterNineExerciseTwo;
public class Business extends Account{
   
    public Business(double bal, String fName, String lName, String str, String city, String st, String zip){
        super(bal,fName,lName,str,city,st,zip);
    }

    
    public void setInfo(){

    }

    public void getInfo(){
        System.out.println(super.toString());
    }
    public void checker(){
        if(super.getBalance() < 500.00){
            super.withdrawal(10);
        }

    }
    public void newbal(){
        System.out.println("$10 was charged from your account due to less than minimum balance. ");
        System.out.println("Please add more balance. ");
    }
}
