package ProblemSolving;

import java.util.Scanner;

public class Problem_4_TemperatureRangeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a temperature: ");
        double t = input.nextDouble();

        if(t>-50 && t<50){
            System.out.println("Valid");
        }else {
            System.out.println("invalid");
        }
    }
}
