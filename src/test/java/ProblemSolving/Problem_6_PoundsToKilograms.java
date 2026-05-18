package ProblemSolving;

import java.util.Scanner;

public class Problem_6_PoundsToKilograms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the wright (pounds) : ");
        double p = input.nextDouble();
        double kg = p * .453;

        System.out.printf("Weight in Kg : %.2f", kg);
    }
}
