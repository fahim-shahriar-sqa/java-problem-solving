package ProblemSolving;

import java.util.Scanner;

public class Problem_11_ArithmeticOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int a = input.nextInt();

        System.out.println("Enter another number : ");
        int b = input.nextInt();

        input.nextLine(); // Fix: consume the leftover newline

        System.out.println("Enter an operator (+,-,*,/) : ");
        String c = input.nextLine();

        int d;

        // Fix: Removed semicolon after 'switch' — that was ending it early
        switch (c) {
            case "+":
                d = a + b;
                System.out.println("Sum of " + a + " and " + b + " is " + d);
                break;
            case "-":
                d = a - b;
                System.out.println("Difference of " + a + " and " + b + " is " + d);
                break;
            case "*":
                d = a * b;
                System.out.println("Product of " + a + " and " + b + " is " + d);
                break;
            case "/":
                if (b != 0) {
                    d = a / b;
                    System.out.println("Quotient of " + a + " and " + b + " is " + d);
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }
    }
}
