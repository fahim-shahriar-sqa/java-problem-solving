package ProblemSolving;

import java.util.Scanner;

public class Problem_3_BooleanOpposite {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a boolean value (True/False) : ");
        boolean b = input.nextBoolean();

        boolean a = !b;
        System.out.println("Boolean opposite: " + a );
    }
}
