package src.Basics02;

import java.util.Scanner;

public class Lab002_SwappingByScanner {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a= sc.nextInt();
        System.out.println("Enter 2nd number");
        int b=sc.nextInt();

        int c;
        c=a;a=b;b=c;
        System.out.println("Value of a,b" + " "+ a + " " + b);



    }
}
