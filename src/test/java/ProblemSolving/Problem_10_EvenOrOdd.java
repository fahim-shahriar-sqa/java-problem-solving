package ProblemSolving;

import java.util.Scanner;

public class Problem_10_EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = input.nextInt();

        if(a%2==0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
    }
}
