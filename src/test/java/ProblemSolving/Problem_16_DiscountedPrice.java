package ProblemSolving;

import java.util.Scanner;

public class Problem_16_DiscountedPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter product price : ");
        float price = input.nextFloat();
        System.out.println("Enter discount percentage : ");
        float percentage = input.nextFloat();

        float discount = (percentage / price) * 100;
        float final_price = price + discount;

        System.out.println("Final price : " + final_price);
    }
}
