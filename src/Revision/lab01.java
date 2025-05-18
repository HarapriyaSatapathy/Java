package src.Revision;

import java.util.Scanner;

public class lab01 {
    public static void main(String[] args) {
        //swap 2 nos

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a");
        int a=sc.nextInt();
        System.out.println("Enter value of b");
        int b=sc.nextInt();

//        int a=80;
//        int b=70;
//        int c;

//        c=a;
//        a=b;
//        b=c;
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println(a);
        System.out.println(b);
    }
}
