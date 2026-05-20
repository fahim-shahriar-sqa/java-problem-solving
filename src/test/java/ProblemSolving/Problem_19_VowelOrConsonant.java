package ProblemSolving;

import java.util.Scanner;

public class Problem_19_VowelOrConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter : ");
        String l = input.nextLine();

        if (l.matches("[a-zA-Z]")) {
            if ( l.equalsIgnoreCase("a") || l.equalsIgnoreCase("e") || l.equalsIgnoreCase("i") || l.equalsIgnoreCase(
                    "o") || l.equalsIgnoreCase("u")){
                System.out.println("Vowel");
            }else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("Invalid input. Only one letter (a-z or A-Z) allowed.");
        }
    }
}
