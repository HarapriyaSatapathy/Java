package src.Array;

import java.util.Scanner;

public class Lab004 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int mark[]=new int [size];
        System.out.println("Enter the marks");

        for(int i=0;i<size;i++){
            mark[i]=sc.nextInt();

        }
        System.out.println("Output is---->");
        for(int i=0;i<size;i++){
            System.out.println(mark[i]);
        }

    }
}
