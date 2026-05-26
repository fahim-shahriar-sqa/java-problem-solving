package ProblemSolving;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem_29_AverageOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println( "Enter numbers (enter 0 to finish): ");

        while (true){
            int num = scanner.nextInt();
            if (num==0){
                break;
            }numbers.add(num);
        }

        double sum = 0;
        int count = 0;

        for (int num : numbers){
            if (num>0){
                sum += num;
                count++;
            }
        }

        if(count == 0){
            System.out.println("No positive numbers entered.");
        }else {
            double avg = sum / count;
            System.out.println("Average: " + avg);
        }
        scanner.close();
    }
}
