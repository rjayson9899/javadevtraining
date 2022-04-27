package ProgrammingInJava.chapter7;

public class CubeCalculator {
    public static double cubeOf(double x){
        double xCubed;

        xCubed = x * x * x;
        return(xCubed);
    }

    public static void main(String[] args) {
        double num = 2.0;
        double cube;

        cube = cubeOf(num);
        System.out.println(cube);
    }
}

