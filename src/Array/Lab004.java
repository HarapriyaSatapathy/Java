package src.Array;

import java.util.Scanner;

public class Lab004 {
    public static void main(String[] args) {
     //Enter marks into an array and traverse it
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the array");
        int s=sc.nextInt();
        int []arr=new int[s];
        System.out.println("Enter the marks");

        for (int i=0;i<s;i++){
            arr[i]=sc.nextInt();

        }
        for (int i=0;i<s;i++){
            System.out.println("The marks are---->"+arr[i]);

        }
        sc.close();

    }
}
