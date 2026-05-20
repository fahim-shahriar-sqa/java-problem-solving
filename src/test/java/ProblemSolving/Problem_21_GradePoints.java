package ProblemSolving;

import java.util.Scanner;

public class Problem_21_GradePoints {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        String grade;

        if(num>=90){
            grade = "A";
        }else if (num>=80){
            grade = "B";
        }else if (num>=70){
            grade = "C";
        }else if (num>=60){
            grade = "D";
        }else {
            grade = "F";
        }

        System.out.println("Grade is : " + grade);

    }
}
