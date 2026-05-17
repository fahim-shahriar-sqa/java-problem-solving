package ProblemSolving;

import java.util.Scanner;

public class Problem_5_StringToNumberConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = input.next();

        double d = Double.parseDouble(s);
        System.out.println("Converted: " + d );
    }
}
