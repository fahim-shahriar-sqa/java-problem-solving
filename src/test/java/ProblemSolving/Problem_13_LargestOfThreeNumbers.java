package ProblemSolving;

import java.util.Scanner;

public class Problem_13_LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First number : ");
        int a = input.nextInt();
        System.out.println("Enter Second number : ");
        int b = input.nextInt();
        System.out.println("Enter Third number : ");
        int c = input.nextInt();

        if(a>b&&a>c){
            System.out.println( a + " is the largest number. ");
        }else if(b>a&&b>c){
            System.out.println( b + " is the largest number. ");
        }else{
            System.out.println( c + " is the largest number");
        }
    }
}
