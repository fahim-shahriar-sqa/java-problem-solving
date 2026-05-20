package ProblemSolving;

import java.util.Scanner;

public class Problem_17_NumberSignCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer : ");
        int num = input.nextInt();

        if (num>0){
            System.out.println("Positive");
        } else if (num<0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
