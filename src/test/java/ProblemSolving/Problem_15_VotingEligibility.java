package ProblemSolving;

import java.util.Scanner;

public class Problem_15_VotingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Age : ");
        int age = input.nextInt();
        System.out.println("Citizenship Status (True/False): ");
        boolean c = input.nextBoolean();

        if (age>=18 && c){
            System.out.println("Eligible.");
        }else {
            System.out.println("Not Eligible.");
        }
    }
}
