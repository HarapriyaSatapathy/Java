package src.Array;

import java.util.Scanner;

public class Lab003 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter mark1");
        int mark1=sc.nextInt();
        System.out.println("Enter mark2");
        int mark2=sc.nextInt();
        System.out.println("Enter mark3");
        int mark3=sc.nextInt();

        int arr[]={mark1,mark2,mark3};
        System.out.println("My Marks are--->");
        for(int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]);
        }
    }
}
