package ProblemSolving;

import java.util.Scanner;

public class Problem_14_CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter principal : ");
        int p = input.nextInt();
        System.out.println("Enter rate : ");
        double r = input.nextDouble();
        System.out.println("Enter Time : ");
        double t = input.nextDouble();

        double A = p * Math.pow((1 + r / 100), t);

        System.out.printf("The amount after %.2f year is %.2f\n", t, A);
    }
}
