package ProblemSolving;

import java.util.Scanner;

public class Problem_28_ReverseStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("String reversed: " + reversed);
        scanner.close();
    }
}
