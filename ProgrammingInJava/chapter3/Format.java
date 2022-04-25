package ProgrammingInJava.chapter3;

public class Format{

    public static void main(String[] args) {
        System.out.format("%-10s  %8s %8s", "Team", "Wins", "Losses\n" );
        System.out.format("%-10s  %8s %8s", "Lakers", "2", "4\n" );
        System.out.format("%-10s  %8s %8s", "Miami", "15", "7\n" );
        System.out.format("%-10s  %8s %8s", "Milwaukee", "8", "3\n" );
    }

}