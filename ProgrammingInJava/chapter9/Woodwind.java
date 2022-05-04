package ProgrammingInJava.chapter9;

abstract class Woodwind extends Instrument {

    public Woodwind(String player){
        super(player);
    }
    
    public String makeSound(){
        return("toot");
    }

}


