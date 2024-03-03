package src.Conditions;

import java.util.Scanner;

public class IfelseUserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to validate even or odd");
        int a=sc.nextInt();

        if (a%2==0){
            System.out.println("Its an even number");
        }
        else{
            System.out.println("Its an odd number");
        }
    }
}
