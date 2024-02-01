package src.Basics02;

import java.util.Scanner;

public class Lab003_SwappingWithoutTemp {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the 1st value");
        int a= sc.nextInt();
        System.out.println("enter the 2nd value");
        int b= sc.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;


        System.out.println("Value of a,b is "+ " "+a +" "+ b);


    }
}
