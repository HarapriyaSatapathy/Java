package src.Conditions;

import java.util.Scanner;

public class IfelseIfMaximumNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st num");
        float a=sc.nextFloat();
        System.out.println("Enter 2st num");
        float b=sc.nextFloat();
        System.out.println("Enter 3rd num");
        float c=sc.nextFloat();

        if(a>b && a>c){
            System.out.println("Maximum num is---->"+a);

        }
        else if (b>a && b>c){
            System.out.println("Maximum num is---->"+b);

        }
        else{
            System.out.println("Maximum num is---->"+c);

        }

    }




}
