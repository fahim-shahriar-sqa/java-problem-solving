package ProblemSolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem_27_LargestNumberInArrayList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter numbers (enter 0 to finish): ");
        while (true){
            int num = scanner.nextInt();
            if (num==0){
                break;
            }
            numbers.add(num);
        }

        if (numbers.isEmpty()){
            System.out.println("No numbers entered");
        } else {
            int max = Collections.max(numbers);
            System.out.println("Largest number is : " + max);
        }
        scanner.close();
    }
}
