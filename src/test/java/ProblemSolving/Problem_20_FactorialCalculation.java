package ProblemSolving;

import java.util.Scanner;

public class Problem_20_FactorialCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a non negative number : ");
        int n = input.nextInt();
        int m = n;
        int f = 1;

        while (m>=1){
            f *= m;
            m--;
        }
        System.out.println("Factorial : " + f );
    }
}
