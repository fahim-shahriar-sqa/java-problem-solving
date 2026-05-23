package ProblemSolving;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem_25_SumOfIntegers {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<>();
        System.out.println("Enter numbers (enter 0 to finish):");
        while (true){
            int num = scanner.nextInt();
            if (num == 0){
                break;
            }number.add(num);
        }

        int sum = 0;
        for (int num : number){
            sum += num;
        }
        System.out.println("Sum of integers: " + sum);
    }
}
