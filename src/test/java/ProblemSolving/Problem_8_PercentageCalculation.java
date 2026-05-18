package ProblemSolving;

import java.util.Scanner;

public class Problem_8_PercentageCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Score : ");
        double a = input.nextDouble();
        System.out.println("Enter the total possible score : ");
        double b = input.nextDouble();

        double c = (a/b)*100;

        System.out.printf("Percentage: %.1f%%\n",c);
    }
}
