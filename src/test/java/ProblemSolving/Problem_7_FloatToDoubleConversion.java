package ProblemSolving;

import java.util.Scanner;

public class Problem_7_FloatToDoubleConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number (float) : ");
        float f = input.nextFloat();

        double d = f;

        System.out.println("Original float value: " + f);
        System.out.println("Converted double value: " + d);
    }
}
