package src.Loops.WhileLoop;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        //4=4+3+2+1=10
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();

         int sum=0;
        for (int i=0;i<=num;i++){
            sum=sum+i;

        }
        System.out.println(sum);
    }
}
//This program can be written in while loop as well
