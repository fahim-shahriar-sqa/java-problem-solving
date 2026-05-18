package ProblemSolving;

import java.util.Scanner;

public class Problem_9_KelvinToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temp in kelvin : ");
        double k = input.nextDouble();

        double c = k - 273.15;

        System.out.printf("Temp is Celsius: %.2f", c );
    }
}
