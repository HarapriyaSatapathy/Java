package src.Loops.WhileLoop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //3=3*2*1=6
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();

         int fact=1;
        for (int i=1;i<=num;i++){
            fact=fact*i;

        }
        System.out.println(fact);
    }
}
//This program can be written in while loop as well
