package src.Practice;

import java.util.Scanner;

public class Lab21 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number, I will tel its factorials");

        int num=sc.nextInt();

        int fact=1;
        for (int i =1;i<=num;i++){
            fact=fact*i;



        }
        System.out.println("Factorial is--->"+fact);

    }
    }

