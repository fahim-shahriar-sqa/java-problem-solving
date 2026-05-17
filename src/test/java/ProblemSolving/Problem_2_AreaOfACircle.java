package ProblemSolving;

import java.util.Scanner;

public class Problem_2_AreaOfACircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius: ");
        int r = input.nextInt();
        double pi = 3.1416;

        double a = pi * r * r;
        System.out.println("Area of the circle is : " + a );
    }
}
