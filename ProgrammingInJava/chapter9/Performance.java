package ProgrammingInJava.chapter9;

public class Performance {

    private String arrangement;
    private Instrument solo;
    private Instrument duet_1, duet_2;
    private Instrument trio_1, trio_2, trio_3;

    public Performance(Instrument s) {
        solo = s;
        arrangement = solo.makeSound();
    }

    public Performance(Instrument duet1, Instrument duet2) {
        duet_1 = duet1;
        duet_2 = duet2;
        arrangement = duet_1.makeSound() + duet_2.makeSound();
    }

    public Performance(Instrument trio1, Instrument trio2, Instrument trio3) {
        trio_1 = trio1;
        trio_2 = trio2;
        trio_3 = trio3;
        arrangement = trio_1.makeSound() + trio_2.makeSound() + trio_3.makeSound();
    }

    public void begin(){
        System.out.println(arrangement);
    }

    public String toString() {
        String program = "The performance includes ";
        program += arrangement;
        return(program);
    }
}
