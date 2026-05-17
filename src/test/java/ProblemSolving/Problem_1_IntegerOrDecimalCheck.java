package ProblemSolving;

import java.util.Scanner;

public class Problem_1_IntegerOrDecimalCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        double num = input.nextDouble();

        if(num % 1 == 0){
            System.out.println("The number is an Integer");
        }else {
            System.out.println("The number is Decimal");
        }





    }
}
