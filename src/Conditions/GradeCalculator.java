package src.Conditions;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        //WOP that calculates & displays the letter grade for a given numerical
        //score(e.g. A,B,C,D or F)based on the following grading score
        //A:90-100
        //A:80-89
        //A:70-79
        //A:60-69
        //A:0-59

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score");
        int score = sc.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("Grade--->A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("Grade--->B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("Grade--->C");
        }
        else if (score>=60 && score<=79) {
            System.out.println("Grade--->A");
        } else
        {
            System.out.println("Grade--->F");
        }

    }

}
