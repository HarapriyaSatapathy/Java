package src.Practice;

import java.util.Scanner;

public class Lab009 {
    public static void main(String[] args) {
        //swapping 2 numbers
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1=sc.nextInt();
        System.out.println("Enter 2nd number");
        int num2=sc.nextInt();

        int swap=num1;
        num1=num2;
        num2=swap;
        System.out.println("The swap of 2 numbers are--->");
        System.out.println(num1);
        System.out.println(num2);
    }
}
